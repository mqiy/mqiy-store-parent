package xyz.mqiy.demo.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import xyz.mqiy.demo.domain.Product;
import xyz.mqiy.demo.service.ProductService;

/**
 * @author chris
 * @Description TODO
 * @Date 2021/5/20 19:14
 */
@DubboService
public class ProductServiceImpl implements ProductService {
    @Override
    public Product getById(Long id) {
        Product user =new Product();
        user.setQuantity(31);
        user.setName("小白鞋");
        user.setId(id);
        return user;
    }
}
