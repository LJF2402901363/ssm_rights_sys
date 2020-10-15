package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Classname:UserController
 *
 * @description:用控制类
 * @author: 陌意随影
 * @Date: 2020-10-15 16:54
 * @Version: 1.0
 **/
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        return  modelAndView;
    }
}
