package xyz.mqiy.demo.service;

import xyz.mqiy.demo.dto.in.ProductAddInDto;
import xyz.mqiy.demo.dto.out.ProductOutDto;

/**
 * @author chris
 * @Description TODO
 * @Date 2021/5/20 19:12
 */
public interface ProductService {

    /**
     * 通过ID获取用户
     * @param id
     * @return
     */
    ProductOutDto getById(Long id);


    Integer save(ProductAddInDto inDto);
}
