package xyz.mqiy.demo.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import xyz.mqiy.demo.dao.ProductMapper;
import xyz.mqiy.demo.dto.in.ProductAddInDto;
import xyz.mqiy.demo.dto.out.ProductOutDto;
import xyz.mqiy.demo.entity.Product;
import xyz.mqiy.demo.service.ProductService;
import xyz.mqiy.demo.util.CopyUtil;

import javax.annotation.Resource;

/**
 * @author chris
 * @Description 商品服务实现
 * @Date 2021/5/20 19:14
 */
@DubboService
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public ProductOutDto getById(Long id) {
        ProductOutDto result =new ProductOutDto();
        result.setQuantity(31);
        result.setName("小白鞋");
        result.setId(id);

        return result;
    }

    @Override
    public Integer save(ProductAddInDto inDto) {
        Product product  = CopyUtil.copyBean(inDto,Product.class);
        return  productMapper.insertSelective(product);
    }
}
