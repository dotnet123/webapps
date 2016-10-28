package cn.le55.dsj.controler;

import cn.le55.dsj.common.Util;
import cn.le55.dsj.dao.*;
import cn.le55.dsj.pojo.KV.*;

import cn.le55.dsj.service.GsonFactory;
import cn.le55.dsj.service.MangoFactory;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
@RequestMapping("/admin")
public class KvController {
    @Autowired
    private HttpServletRequest request;
    //@Autowired
    // private HttpServletResponse response;
    private final KVDao dao = MangoFactory.mango.create(KVDao.class);



    @RequestMapping(value = "/kv/{key}")
    public ModelAndView index2(@PathVariable String key,int[] seqno,String[] pic1,String[] url) {

        KV kv= dao.getKV(key);
       String RequestMethod= request.getMethod();
String alert="";
        if(RequestMethod.equalsIgnoreCase("POST"))
        {
            kv.setId(Util.getNewId());
            kv.setMykey(key);
            List<HotPic> lst = new ArrayList<HotPic>();
            int length = seqno.length;
            for (int i=0;i<length;i++)
            {
                HotPic hot1 = new HotPic();
                hot1.pic1=pic1[i];
                hot1.seqno=seqno[i];
                hot1.url=url[i];
                lst.add(hot1);
            }
            kv.setMyvalue(GsonFactory.gson.toJson(lst));
            int count = dao.insertKV(kv);
            if (count > 0) {
                dao.deleteKV(kv.getId(), key);

            }
            alert="修改成功";
        }

        List<HotPic> hotpics= GsonFactory.gson.fromJson(kv.getMyvalue(),new TypeToken<List<HotPic>>() {}.getType());
        return new ModelAndView("admin/kvlist.jsp").addObject("list",hotpics).addObject("alert",alert);
    }
}
