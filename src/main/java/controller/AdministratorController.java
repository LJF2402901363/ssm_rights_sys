package controller;

import entity.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.AdministratorService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Classname:AdministratorController
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-09-03 21:50
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/administrator")
public class AdministratorController {
    @Autowired
    AdministratorService administratorService;

    /**
     * @param httpServletResponse ：
     * @return org.springframework.web.servlet.ModelAndView
     * @Description :登陆成功跳转到主页面
     * @Date 0:26 2020/9/15 0015
     * @Param * @param httpServletRequest
     **/
    @RequestMapping("/homePage")
    public ModelAndView login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        ModelAndView modelAndView = new ModelAndView();
        String name = httpServletRequest.getParameter("name");
        String password = httpServletRequest.getParameter("password");
        Administrator administrator = new Administrator();
        administrator.setName(name);
        administrator.setPassword(password);
        Administrator login = administratorService.login(administrator);
        //设置全局的登录会话
        httpServletRequest.getSession().setAttribute("loginAdmin", login);
        modelAndView.addObject("administrator", login);
        modelAndView.setViewName("homePage");
        return modelAndView;
    }

    /**
     * @return java.lang.String
     * @Description :跳转到登陆页面
     * @Date 0:25 2020/9/15 0015
     * @Param * @param  ：
     **/
    @RequestMapping("/toLoginPage")
    public String toLoginPage() {
        return "login";
    }

    /**
     * @return org.springframework.web.servlet.ModelAndView
     * @Description :跳转到注册页面
     * @Date 0:26 2020/9/15 0015
     * @Param * @param  ：
     **/
    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }

    @RequestMapping("/register")
    @ResponseBody
    public String register(@RequestParam("name") String name, @RequestParam("password") String password, @RequestParam("email") String email) {
        Administrator administrator = new Administrator();
        administrator.setName(name);
        administrator.setPassword(password);
        administrator.setEmail(email);
        //查找该用户是否已经存在
        boolean fla = administratorService.isRegister(administrator);
        String statusCode = "";
        if (fla) {
            //已经注册
            statusCode = "already register!";
        } else {
            //未注册
            //开始保存
            boolean isSava = administratorService.saveAdministrator(administrator);
            if (isSava) {
                //保存成功
                statusCode = "register successfully !";
            } else {
                //保存失败
                statusCode = "failed to register !";
            }
        }
        String dataJson = "{\"msg\":" + statusCode + "}";
        return dataJson;
    }
}
