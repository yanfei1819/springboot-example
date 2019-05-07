package com.yanfei1819.mybatismapperdemo.service.impl;

import com.yanfei1819.mybatismapperdemo.dao.UserMapper;
import com.yanfei1819.mybatismapperdemo.entity.User;
import com.yanfei1819.mybatismapperdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 追梦1819 on 2019-05-07.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public int deleteUser(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<User> listUsers() {
        return userMapper.selectAll();
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
