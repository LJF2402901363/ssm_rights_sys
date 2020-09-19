package service;

import entity.PageBean;
import entity.Product;

import java.util.List;

/**
 * Classname:ssmdemo
 *
 * @description:{description}
 * @author: 陌意随影
 * @Date: 2020-08-26 11:09
 */
public interface ProductService {
    /**
     * @return java.util.List<entity.Product>
     * @Description :查找所有商品
     * @Date 11:08 2020/8/26 0026
     * @Param * @param  ：
     **/
    public List<Product> findAll() throws Exception;

    /**
     * @return entity.PageBean<entity.Product>
     * @Description :通过分页查询条件查询结果集
     * @Date 23:32 2020/9/9 0009
     * @Param * @param pageBean ：
     **/
    public List<Product> findProductByPageBean(String searchContext);

    /**
     * @return boolean
     * @Description :通过ID删除商品
     * @Date 21:17 2020/9/14 0014
     * @Param * @param productId ：
     **/
    public boolean deleteProductById(int productId);
}
