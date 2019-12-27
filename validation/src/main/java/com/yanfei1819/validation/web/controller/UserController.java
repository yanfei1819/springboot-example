package com.yanfei1819.validation.web.controller;

import com.yanfei1819.validation.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * Created by 追梦1819 on 2019-07-01.
 */
@Controller
public class UserController {


    @ResponseBody
    @PostMapping("/insertUser")
    public String insertUser(@Valid User user){
        return "姓名是："+user.getName()+"年龄是："+user.getAge()+"邮箱是："+user.getEmail();
    }
}
