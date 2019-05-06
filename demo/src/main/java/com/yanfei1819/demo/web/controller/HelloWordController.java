package com.yanfei1819.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 追梦1819 on 2019-05-06.
 */
@Controller
public class HelloWordController {

    @ResponseBody
    @GetMapping("/helloWord") // <===> @RequestMapping(value = "/helloWord",method = RequestMethod.POST)
    public String helloWord(){
        return "Hello Word,SpringBoot!";
    }
}
