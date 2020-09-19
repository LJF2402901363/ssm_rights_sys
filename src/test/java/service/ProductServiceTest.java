package service;
import	java.awt.Component;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import entity.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.impl.ProductServiceImpl;

import java.util.List;

/**
 * Classname:ProductServiceTest
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-08-26 15:24
 * @Version: 1.0
 **/
public class ProductServiceTest {
    private ApplicationContext applicationContext;
    private ProductService productService;
@BeforeEach
    public void init(){
    applicationContext = new ClassPathXmlApplicationContext("applicationContexConfig.xml");
    productService = applicationContext.getBean("productService", ProductService.class);
}
@Test
    public void testFindAllProduct() throws Exception {
    List<Product> all = productService.findAll();
    for (Product product:all){
        System.out.println(product);
    }
}
@Test
    public void testFindProductByProduct(){
    PageHelper.startPage(1,10);
    List<Product> list = productService.findProductByPageBean("a");
    PageInfo<Product> pageInfo=new PageInfo<>(list);
    System.out.println("总数："+pageInfo.getTotal());
    for (Product product : pageInfo.getList()){
        System.out.println(product);
    }
    }
    @Test
    public void testdeleteProductByProduct(){
        boolean deleteProductById = productService.deleteProductById(1);
        System.out.println(deleteProductById);
    }
}
