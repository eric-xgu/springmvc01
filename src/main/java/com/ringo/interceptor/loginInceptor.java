package com.ringo.interceptor;

import com.ringo.vo.User;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginInceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*
        * 获取用户的session，session存在请求合法，放行，session不存在，非法
        *
        * */
        User user=(User)request.getSession().getAttribute("userinfo");
        if(null==user){
                //用户未登录，session失效
            response.sendRedirect(request.getContextPath()+"/login.jsp");
            return false;
        }

        return super.preHandle(request, response, handler);
    }
}
