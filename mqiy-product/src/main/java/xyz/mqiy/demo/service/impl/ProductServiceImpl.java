package xyz.mqiy.demo.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import xyz.mqiy.demo.dto.out.ProductOutDto;
import xyz.mqiy.demo.service.ProductService;

/**
 * @author chris
 * @Description TODO
 * @Date 2021/5/20 19:14
 */
@DubboService
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductOutDto getById(Long id) {
        ProductOutDto result =new ProductOutDto();
        result.setQuantity(31);
        result.setName("小白鞋");
        result.setId(id);
        return result;
    }
}
