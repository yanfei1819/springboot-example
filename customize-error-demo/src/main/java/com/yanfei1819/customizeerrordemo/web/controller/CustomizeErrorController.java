package com.yanfei1819.customizeerrordemo.web.controller;

import com.yanfei1819.customizeerrordemo.web.handler.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 追梦1819 on 2019-06-06.
 */
@Controller
public class CustomizeErrorController {

    @GetMapping("/customizeViewError")
    public void customizeViewError(){
        System.out.println("自定义页面异常");
        throw new UserNotExistException();
    }

    @ResponseBody
    @GetMapping("/customizeDataError")
    public void customizeDataError(){
        System.out.println("自定义客户端异常");
        throw new UserNotExistException();
    }


}
