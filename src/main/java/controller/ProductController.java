package controller;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.ProductService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Classname:ProductController
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-08-26 11:13
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/findAll.do")
    @ResponseBody
    public String findAll(@RequestParam("start") int start, @RequestParam("length") int pageSize, @RequestParam("search[value]") String searchContent) throws Exception {
        //计算当前页面
        int pageNum = start / pageSize + 1;
        String jsonData = "";
        ObjectMapper objectMapper = new ObjectMapper();
        PageHelper.startPage(pageNum, pageSize, true);
        try {
            List<Product> list = productService.findProductByPageBean(searchContent);
            PageInfo<Product> pageInfo = new PageInfo<>(list);
            jsonData = objectMapper.writeValueAsString(pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            jsonData = objectMapper.writeValueAsString(new PageInfo<>());
        } finally {
            return jsonData;
        }

    }

    @RequestMapping("/deleteProductById")
    @ResponseBody
    public String deleteProductById(@RequestParam("id") int id) {
        boolean flag = productService.deleteProductById(id);
        String jsonData = "";
        if (flag == true) {
            jsonData = "{\"status\":1}";
        } else {
            jsonData = "{\"status\":1}";
        }
//        ObjectMapper objectMapper = new ObjectMapper();
//        try {
//            jsonData = objectMapper.writeValueAsString(jsonData);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
        return jsonData;
    }
}
