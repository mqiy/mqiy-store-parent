package xyz.mqiy.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import xyz.mqiy.demo.domain.User;
import xyz.mqiy.demo.service.UserService;

/**
 * @author chris
 * @Description TODO
 * @Date 2021/5/20 19:14
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getById(Long id) {
        User user =new User();
        user.setAge(31);
        user.setName("chris");
        user.setId(id);
        return user;
    }
}
