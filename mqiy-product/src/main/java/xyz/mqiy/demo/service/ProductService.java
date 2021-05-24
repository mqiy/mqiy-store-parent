package xyz.mqiy.demo.service;

import xyz.mqiy.demo.domain.Product;

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
    Product getById(Long id);
}
