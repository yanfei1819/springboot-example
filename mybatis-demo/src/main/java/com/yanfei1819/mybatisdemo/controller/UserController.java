package com.yanfei1819.mybatisdemo.controller;

import com.yanfei1819.mybatisdemo.entity.UserListResponse;
import com.yanfei1819.mybatisdemo.entity.UserResponse;
import com.yanfei1819.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 追梦1819 on 2019-05-05.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/queryUsers")
    public UserListResponse queryUsers(){
        return userService.queryUsers();
    }

    @ResponseBody
    @GetMapping("/queryUserByName")
    public UserResponse queryUserByName(String name){
        return userService.queryUserByName(name);
    }

}
