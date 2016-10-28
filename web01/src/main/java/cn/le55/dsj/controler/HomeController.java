package cn.le55.dsj.controler;

import cn.le55.dsj.dao.MsgDao;
import cn.le55.dsj.pojo.Msg;
import cn.le55.dsj.service.MangoFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/index.do")
    public ModelAndView index() {
        Msg msg = new Msg();
        long mm = msg.getId();

       MsgDao dao = MangoFactory.mango.create(MsgDao.class);
      List<Msg> msgLst = dao.getMsg(4611972580645899716L,4612089803218717783L);
     // int retInt = dao.deleteMsg(4612246756606579267L);

        return new ModelAndView("index.jsp").addObject("msg", msgLst);
    }

    @RequestMapping("/login")
    public ModelAndView login(String username, String pw) {

        List<String> pars = new ArrayList<String>();
        pars.add(username);
        pars.add(pw);
        return new ModelAndView("index.jsp").addObject("msg", pars);
    }
    @ResponseBody
    @RequestMapping("/foot")
    public ModelAndView foot(String username, String pw) {

        List<String> pars = new ArrayList<String>();

        return new ModelAndView("foot.jsp").addObject("msg", pars);
    }
}