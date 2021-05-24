package xyz.mqiy.demo.service.impl;

import xyz.mqiy.demo.domain.Order;
import xyz.mqiy.demo.service.OrderService;

/**
 * @author chris
 * @Description TODO
 * @Date 2021/5/20 19:14
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public Order getById(Long id) {
        Order user =new Order();
        user.setProductId(31);
        user.setName("chris");
        user.setId(id);
        return user;
    }
}
