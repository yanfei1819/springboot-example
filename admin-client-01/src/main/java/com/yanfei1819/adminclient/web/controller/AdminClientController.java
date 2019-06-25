package com.yanfei1819.adminclient.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 追梦1819 on 2019-06-24.
 */
@Controller
public class AdminClientController {

    @GetMapping("/test")
    public void test(){
        System.out.println("---------------");
    }
}
