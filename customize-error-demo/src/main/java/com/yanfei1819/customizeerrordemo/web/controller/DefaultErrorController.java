package com.yanfei1819.customizeerrordemo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 追梦1819 on 2019-05-09.
 */
@Controller
public class DefaultErrorController {

    @GetMapping("/defaultViewError")
    public void defaultViewError(){
        System.out.println("默认页面异常");
    }

    @ResponseBody
    @GetMapping("/defaultDataError")
    public void defaultDataError(){
        System.out.println("默认的客户端异常");
    }
}
