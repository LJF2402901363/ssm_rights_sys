package dao;

import entity.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Classname:ssmdemo
 *
 * @description:{description}
 * @author: 陌意随影
 * @Date: 2020-08-26 11:07
 */
@Repository("productDao")
public interface ProductDao {
    /**
     * @return java.util.List<entity.Product>
     * @Description :查找所有商品
     * @Date 11:08 2020/8/26 0026
     * @Param * @param  ：
     **/
    public List<Product> findAll() throws Exception;

    public int getCount(String sql);

    /**
     * @return java.util.List<entity.Product>
     * @Description :通过模糊查询的文本返回对应集合
     * @Date 21:07 2020/9/10 0010
     * @Param * @param searchContext ：
     **/
    public List<Product> findPruductByPage(String searchContext);

    /**
     * @return int
     * @Description :通过ID删除对应的商品
     * @Date 21:18 2020/9/14 0014
     * @Param * @param productId ：
     **/
    public int deleteProductById(int productId);
}
