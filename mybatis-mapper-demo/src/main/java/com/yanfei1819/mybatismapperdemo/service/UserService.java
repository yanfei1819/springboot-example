package com.yanfei1819.mybatismapperdemo.service;

import com.yanfei1819.mybatismapperdemo.entity.User;

import java.util.List;

/**
 * Created by 追梦1819 on 2019-05-07.
 */
public interface UserService {
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(Long id);
    List<User> listUsers();
    User getUserById(Long id);
}
