package service.impl;

import dao.ProductDao;
import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.ProductService;

import java.util.List;

/**
 * Classname:ProductServiceImpl
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-08-26 11:10
 * @Version: 1.0
 **/
@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }

    @Override
    public List<Product> findProductByPageBean(String searchContext) {
        return productDao.findPruductByPage(searchContext);

    }

    @Override
    public boolean deleteProductById(int productId) {
        return productDao.deleteProductById(productId) == 1;
    }
}
