package com.yanfei1819.mybatismapperdemo.web.controller;

import com.yanfei1819.mybatismapperdemo.entity.User;
import com.yanfei1819.mybatismapperdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 追梦1819 on 2019-05-07.
 */
@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/listUsers")
    public List<User> listUser(){
        return service.listUsers();
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Long id){
        return service.getUserById(id);
    }

    @PostMapping("/insertUser")
    public int insertUser(User user){
        return service.insertUser(user);
    }

    @PostMapping("/updateUser")
    public int updateUser(User user){
        return service.updateUser(user);
    }

    @GetMapping("/deleteUser/{id}")
    public int deleteUser(@PathVariable Long id){
        return service.deleteUser(id);
    }

}
