package xyz.mqiy.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;
import xyz.mqiy.demo.domain.User;
import xyz.mqiy.demo.service.UserService;

/**
 * @author chris
 * @Description TODO
 * @Date 2021/5/20 19:14
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public User getById(Long id) {
        User user =new User();
        user.setAge(31);
        user.setName("chris");
        user.setId(id);
        return user;
    }

    @Override
    public Integer save(User user) {
        log.info("save success:",user.getName());
        return 1;
    }
}
