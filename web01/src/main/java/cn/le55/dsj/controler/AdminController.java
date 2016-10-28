package cn.le55.dsj.controler;

import cn.le55.dsj.common.Util;
import cn.le55.dsj.dao.MsgDao;
import cn.le55.dsj.dao.NavDao;


import cn.le55.dsj.pojo.Msg;
import cn.le55.dsj.pojo.Nav;
import cn.le55.dsj.pojo.PageResult;
import cn.le55.dsj.pojo.Return;
import cn.le55.dsj.service.GsonFactory;
import cn.le55.dsj.service.MangoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private HttpServletRequest request;


    @ResponseBody
    @RequestMapping("/nav/list")
    public String navlist() {
        List<Nav> lst = MangoFactory.mango.create(NavDao.class).getNav(3);
        String str = GsonFactory.gson.toJson(lst);
        return str;
    }



    @RequestMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("admin/index.jsp");
    }

    @RequestMapping("/top.do")
    public ModelAndView top() {
        return new ModelAndView("admin/top.jsp");
    }

    @RequestMapping("/foot.do")
    public ModelAndView foot() {
        return new ModelAndView("admin/foot.jsp");
    }
}
