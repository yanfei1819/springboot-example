package com.yanfei1819.jpademo.web.controller;

import com.yanfei1819.jpademo.entity.User;
import com.yanfei1819.jpademo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 追梦1819 on 2019-05-05.
 */
@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @ResponseBody
    @GetMapping("/queryUser")
    public List<User> queryUser(){
        return userRepository.findAll();
    }
}
