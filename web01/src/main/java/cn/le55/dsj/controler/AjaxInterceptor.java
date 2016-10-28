package cn.le55.dsj.controler;

import cn.le55.dsj.pojo.Msg;
import cn.le55.dsj.service.GsonFactory;
import cn.le55.dsj.service.LongTypeAdapter;
import com.google.gson.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class AjaxInterceptor extends HandlerInterceptorAdapter {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获得请求路径的uri
        String uri = request.getRequestURI();

//        // 进入登录页面，判断session中是否有key，有的话重定向到首页，否则进入登录界面
//        if(uri.contains("login")) {
//            if(request.getSession().getAttribute("user") != null) {
//                response.sendRedirect(request.getContextPath());//默认跟路径为首页
//            } else {
//                return true;//继续登陆请求
//            }
//        }
//
//        // 其他情况判断session中是否有key，有的话继续用户的操作
//        if(request.getSession().getAttribute("user") != null) {
//            return true;
//        }
//
//        // 最后的情况就是进入登录页面
//        response.sendRedirect(request.getContextPath() + "/login");
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

        if (request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest"))
        {
            //如果是ajax请求响应头会有，x-requested-with

            Map<String, Object> map= modelAndView.getModel();
           Object one= map.get("one");
            String str= GsonFactory.gson.toJson(one);
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            PrintWriter out = null;
            try {
                out = response.getWriter();
                out.append(str);

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    out.close();
                }
            }
        }


//        FavUser favUser = (FavUser) (request.getSession()).getAttribute(SysConstants.USER_SESSION_KEY);
//        if (favUser == null) {
//            modelAndView.setViewName("redirect:/login");
//        }
    }

}
