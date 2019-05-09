package com.yanfei1819.changeportdemo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 追梦1819 on 2019-05-09.
 */
@Controller
public class ChangePortController {

    @ResponseBody
    @GetMapping("/changePortController")
    public String changePortController(){
        return "index";
    }
}
