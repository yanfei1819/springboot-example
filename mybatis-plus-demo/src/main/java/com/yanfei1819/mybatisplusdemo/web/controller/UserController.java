package com.yanfei1819.mybatisplusdemo.web.controller;

import com.yanfei1819.mybatisplusdemo.entity.User;
import com.yanfei1819.mybatisplusdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 追梦1819 on 2019-05-17.
 */
@RestController
public class UserController {


    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUsers")
    public List<User> queryUsers(){
        return userMapper.selectList(null);
    }
}
