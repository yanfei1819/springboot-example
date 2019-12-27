package com.yanfei1819.adminclient.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 追梦1819 on 2019-06-24.
 */
@RestController
public class AdminClientController {

    @GetMapping("/test")
    public void test(){
        System.out.println("---------------");
    }
}
