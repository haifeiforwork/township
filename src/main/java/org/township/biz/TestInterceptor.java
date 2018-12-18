package org.township.biz;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.township.entity.user.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestInterceptor implements HandlerInterceptor {


    /**
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return 返回true继续向下执行否则相反
     * @throws Exception
     */

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        httpServletRequest.setCharacterEncoding("UTF-8");
        if (httpServletRequest.getSession().getAttribute("user") == null ) {
            httpServletRequest.getRequestDispatcher("/tologin.jsp").forward(httpServletRequest,httpServletResponse);
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
      /*  User user = (User)o;
        if (user == null || StringUtils.isEmpty(user.getToken()) ) {
            modelAndView.addObject("msg","当前用户未登录或token已过期");
            modelAndView.setViewName("/toLogin.jsp");
        }*/

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        // 关闭资源文件等
    }
}
