package xyz.mqiy.demo.service;

import xyz.mqiy.demo.domain.User;

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
    User getById(Long id);


    Integer save(User user);
}
