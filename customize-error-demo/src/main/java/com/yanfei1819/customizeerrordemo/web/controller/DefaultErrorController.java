package com.yanfei1819.customizeerrordemo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 追梦1819 on 2019-05-09.
 */
@Controller
public class DefaultErrorController {

    @GetMapping("/defaultError")
    public void defaultError(){
        System.out.println("自定义异常");
    }
}
