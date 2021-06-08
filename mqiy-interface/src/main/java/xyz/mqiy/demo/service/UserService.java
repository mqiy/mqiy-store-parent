package xyz.mqiy.demo.service;

import xyz.mqiy.demo.dto.in.UserAddInDto;
import xyz.mqiy.demo.dto.out.UserOutDto;

/**
 * @author chris
 * @Description TODO
 * @Date 2021/5/20 19:12
 */
public interface UserService {

    /**
     * 通过ID获取用户
     * @param id
     * @return
     */
    UserOutDto getById(Long id);


    Long addUser(UserAddInDto dto);
}
