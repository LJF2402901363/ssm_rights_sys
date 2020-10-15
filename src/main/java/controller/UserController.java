package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import java.util.List;

/**
 * Classname:UserController
 *
 * @description:用控制类
 * @author: 陌意随影
 * @Date: 2020-10-15 16:54
 * @Version: 1.0
 **/
@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/findAll.do")
    @ResponseBody
    public String findAll(@RequestParam("start") int start, @RequestParam("length") int pageSize, @RequestParam("search[value]") String searchContent) throws Exception {
        //计算当前页面
        int pageNum = start / pageSize + 1;
        String jsonData = "";
        //实例化一个mapper用于写json格式
        ObjectMapper objectMapper = new ObjectMapper();
        //开始分页
        PageHelper.startPage(pageNum, pageSize, true);
        try {
            //进行查找然后并返回分页数据
            List<User> list = userService.findProductByPageBean(searchContent);
            PageInfo<User> pageInfo = new PageInfo<>(list);
            jsonData = objectMapper.writeValueAsString(pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            jsonData = objectMapper.writeValueAsString(new PageInfo<>());
        } finally {
            return jsonData;
        }

    }
    @RequestMapping("/deleteUserById.do")
    @ResponseBody
    public String deleteUserById(@RequestParam("id") int id) {
        boolean flag = userService.deleteUserById(id);
        String jsonData = "";
        if (flag == true) {
            jsonData = "{\"status\":1}";
        } else {
            jsonData = "{\"status\":0}";
        }
        return jsonData;
    }
    @RequestMapping("/userPage")
    public String toUserPage(){
        System.out.println("用户管理主页。。");
        return "userPage";
    }
}
