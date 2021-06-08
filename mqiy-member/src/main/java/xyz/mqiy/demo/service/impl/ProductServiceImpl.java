package xyz.mqiy.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import xyz.mqiy.demo.dto.in.ProductAddInDto;
import xyz.mqiy.demo.dto.out.ProductOutDto;
import xyz.mqiy.demo.service.ProductService;

/**
 * @author chris
 * @Description TODO
 * @Date 2021/5/20 19:14
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductOutDto getById(Long id) {
        ProductOutDto user = new ProductOutDto();
        user.setQuantity(31);
        user.setName("小白鞋");
        user.setId(id);
        return user;
    }

    @Override
    public Integer save(ProductAddInDto inDto) {
        return null;
    }
}
