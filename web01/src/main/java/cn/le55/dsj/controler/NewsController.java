package cn.le55.dsj.controler;


import cn.le55.dsj.common.Util;


import cn.le55.dsj.dao.*;
import cn.le55.dsj.pojo.*;
import cn.le55.dsj.service.GsonFactory;
import cn.le55.dsj.service.MangoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

import java.util.*;

@Controller
@RequestMapping("/admin")
public class NewsController {
    @Autowired
    private HttpServletRequest request;
    private final NewsDao dao = MangoFactory.mango.create(NewsDao.class);

    @RequestMapping(value = "/news/list", method = RequestMethod.GET)
    public ModelAndView index() {

        NewsQuery query = new NewsQuery();
        query.setTitle("你好");
        int count= dao.queryCount(query);

        List<News> msgLst = dao.query(query);//new int[]{catid}

        return new ModelAndView("admin/newslist.jsp").addObject("list", msgLst).addObject("count",count);
    }


    @RequestMapping(value = "/news/one/{id}", method = RequestMethod.GET)
    public ModelAndView getOne(@PathVariable Long id) {
        News msg = new News();
        msg.setCtime(new Date());

        if (id != null && id > 0) {

            NewsQuery query = new NewsQuery();
            query.setIds(new long[]{id});
            List<News> msgLst = dao.query(query);
           msg = msgLst.get(0);

        }
        return new ModelAndView("admin/newsone.jsp").addObject("one", msg);
    }
    @ResponseBody
    @RequestMapping(value = "/news/one/{id}", method = RequestMethod.POST)
    public ModelAndView AddMsg(@PathVariable Long id, News msg) throws Exception {

        int retInt;

        if (id > 0) {

            retInt = dao.update(msg);
        } else {
            msg.setCtime(new Date());
            msg.setId(Util.getNewId());
            retInt = dao.insert(msg);
        }

        return new ModelAndView("admin/newsone.jsp").addObject("one", msg).addObject("alert","修改成功");
    }
}
