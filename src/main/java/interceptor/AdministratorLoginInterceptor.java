package interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Classname:AdministratorInterceptor
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-09-03 23:26
 * @Version: 1.0
 **/
public class AdministratorLoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object attribute = request.getSession().getAttribute("loginAdmin");
        if (attribute == null) {
            //说明未登录跳转到登录页面
            response.sendRedirect(request.getContextPath() + "/WEB-INF/pages/login.jsp");

            //需要进行拦截
            return false;
        } else {
            //登录成功不拦截
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
