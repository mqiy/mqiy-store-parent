package xyz.mqiy.demo.service;

import xyz.mqiy.demo.domain.Order;

/**
 * @author chris
 * @Description TODO
 * @Date 2021/5/20 19:12
 */
public interface OrderService {

    /**
     * 通过ID获取用户
     * @param id
     * @return
     */
    Order getById(Long id);

}
