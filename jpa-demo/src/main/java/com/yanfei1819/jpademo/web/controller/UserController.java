package com.yanfei1819.jpademo.web.controller;

import com.yanfei1819.jpademo.entity.User;
import com.yanfei1819.jpademo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        // 通过 jpa 内置的方法进行查询
        return userRepository.findAll();
    }

    @ResponseBody
    @GetMapping("/queryUser/{name}")
    public User queryUserByName(@PathVariable String name){
        // 通过自定义的方法进行查询
        return userRepository.findByName(name);
    }

    @ResponseBody
    @GetMapping("/queryUser2/{id}")
    public User queryUserById(@PathVariable Long id){
        // 通过 @Query 注解查询
        return userRepository.withIdQuery(id);
    }
}