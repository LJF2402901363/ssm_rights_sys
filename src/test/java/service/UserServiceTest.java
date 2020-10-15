package service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import entity.Product;
import entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Classname:UserServiceTest
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-10-15 20:29
 * @Version: 1.0
 **/
public class UserServiceTest {
    private ApplicationContext applicationContext;
    private UserService UserService;
    @BeforeEach
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContexConfig.xml");
       UserService = applicationContext.getBean("productService",UserService.class);
    }
    @Test
    public void testFindAllProduct() throws Exception {
        List<User> all =UserService.findAll();
        for (User user:all){
            System.out.println(user);
        }
    }
    @Test
    public void testFindProductByProduct(){
        PageHelper.startPage(1,10);
        List<User> list =UserService.findProductByPageBean("a");
        PageInfo<User> pageInfo=new PageInfo<>(list);
        System.out.println("总数："+pageInfo.getTotal());
        for (User user : pageInfo.getList()){
            System.out.println(user);
        }
    }
    @Test
    public void testdeleteProductByProduct(){
        boolean deleteProductById =UserService.deleteUserById(1);
        System.out.println(deleteProductById);
    }
}
