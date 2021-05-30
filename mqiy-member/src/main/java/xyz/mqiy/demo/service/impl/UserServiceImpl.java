package xyz.mqiy.demo.service.impl;

import xyz.mqiy.demo.dto.in.UserAddInDto;
import xyz.mqiy.demo.dto.out.UserOutDto;
import xyz.mqiy.demo.service.UserService;

/**
 * @author chris
 * @Description TODO
 * @Date 2021/5/20 19:14
 */

public class UserServiceImpl implements UserService {
    @Override
    public UserOutDto getById(Long id) {
        UserOutDto user =new UserOutDto();
        user.setAge(31);
        user.setName("chris");
        user.setId(id);
        return user;
    }

    @Override
    public Long addUser(UserAddInDto dto) {
        return null;
    }
}
