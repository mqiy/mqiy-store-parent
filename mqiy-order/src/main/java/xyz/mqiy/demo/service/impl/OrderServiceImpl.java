package xyz.mqiy.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import xyz.mqiy.demo.dto.out.OrderOutDto;
import xyz.mqiy.demo.service.OrderService;

import javax.annotation.Resource;

/**
 * @author chris
 * @Description TODO
 * @Date 2021/5/20 19:14
 */

@Service
public class OrderServiceImpl implements OrderService {


    @Override
    public OrderOutDto getById(Long id) {
        OrderOutDto user =new OrderOutDto();
        user.setProductId(31L);
        user.setName("chris");
        user.setId(id);
        return user;
    }
}
