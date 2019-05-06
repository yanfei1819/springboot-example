package com.yanfei1819.mybatisdemo.service.impl;

import com.yanfei1819.mybatisdemo.db.dao.UserDao;
import com.yanfei1819.mybatisdemo.db.dto.UserDto;
import com.yanfei1819.mybatisdemo.db.mapper.UserMapper;
import com.yanfei1819.mybatisdemo.entity.UserListResponse;
import com.yanfei1819.mybatisdemo.entity.UserResponse;
import com.yanfei1819.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 追梦1819 on 2019-05-05.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserListResponse queryUsers() {
        List<UserDto> userDtos = userDao.queryList();
        UserListResponse response = new UserListResponse();
        response.setUsers(userDtos);
        response.setCode(0);
        response.setMsg("success");
        return response;
    }

    @Override
    public UserResponse queryUserByName(String name){
        UserDto userDto = userMapper.queryUserByName(name);
        UserResponse response = new UserResponse();
        response.setUser(userDto);
        response.setCode(0);
        response.setMsg("success");
        return response;
    }
}
