package cn.le55.dsj.controler;

import cn.le55.dsj.*;
import cn.le55.dsj.common.Util;
import cn.le55.dsj.dao.*;
import cn.le55.dsj.pojo.*;
import cn.le55.dsj.service.*;
import org.jfaster.mango.parser.ASTElseIfStatement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.print.DocFlavor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class MsgController {
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;
    private final MsgDao dao = MangoFactory.mango.create(MsgDao.class);

    @RequestMapping(value = "/msg/list", method = RequestMethod.GET)
    public ModelAndView index(Long cateid, Integer page) {

        MsgQuery query = new MsgQuery();

        if (cateid != null && cateid > 0)
            query.setCateid(new Long[]{cateid});

        int count = dao.queryCount(query);

        int _page = page == null ? 1 : page;
        int pagesize = 20;
        query.setSkip((_page - 1) * pagesize);
        query.setTake(pagesize);
        List<Msg> Lst = dao.query(query);

        for (Msg msg : Lst) {
            if (msg.getPic1().equals("0")) {
                msg.setPic1("/images/no.jpg");
            } else {
                msg.setPic1("http://www.dsjjns.com/" + msg.getPic1());
            }
            if (msg.getPic2().equals("0")) {
                msg.setPic2("/images/no.jpg");
            } else {
                msg.setPic2("http://www.dsjjns.com/" + msg.getPic2());
            }
            if (msg.getPic3().equals("0")) {
                msg.setPic3("/images/no.jpg");
            } else {
                msg.setPic3("http://www.dsjjns.com/" + msg.getPic3());
            }
            if (msg.getPic4().equals("0")) {
                msg.setPic4("/images/no.jpg");
            } else {
                msg.setPic4("http://www.dsjjns.com/" + msg.getPic4());
            }

        }


        List<Nav> navlist = MangoFactory.mango.create(NavDao.class).getNav(3);
        return new ModelAndView("admin/msglist.jsp")
                .addObject("list", Lst)
                .addObject("count", count)
                .addObject("navlist", navlist);
    }


    @RequestMapping(value = "/msg/one/{id}", method = RequestMethod.GET)
    public ModelAndView getOne(@PathVariable long id) {
        Msg msg = new Msg();
        msg.setUtime(new Date());
        msg.setCtime(new Date());
        if (id > 0) {
            MsgQuery query = new MsgQuery();
            query.setIds(new long[]{id});
            List<Msg> msgLst = dao.query(query);
            msg = msgLst.get(0);
        }
        return new ModelAndView("admin/msgone.jsp").addObject("one", msg);
    }


    @RequestMapping(value = "/msg/one/{id}", method = RequestMethod.POST)
    public String AddMsg(@PathVariable long id, Msg msg, final RedirectAttributes redirectAttributes) throws Exception  {

         String retmsg = "提交失败";

        if (id > 0) {
            msg.setUtime(new Date());
             dao.updateMsg(msg);
            retmsg = "更新成功";
        } else {
            msg.setCtime(new Date());
            msg.setId(Util.getNewId());
             dao.insertMsg(msg);
            retmsg = "添加成功";
        }

        redirectAttributes.addFlashAttribute("alert",retmsg);

        return "redirect:/admin/msg/one/"+msg.getId();
    }


}
