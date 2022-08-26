package com.sys.yms.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class MyInterceptor implements HandlerInterceptor {
    /**
     * 拦截请求，防止非法登录
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //判断session当中是否有adminInfo
        if(request.getSession().getAttribute("adminInfo") !=null){
            return true;
        }
        //重定向到登录页面
        response.sendRedirect("loginPage");
        //拦截请求
        return false;
    }
}
