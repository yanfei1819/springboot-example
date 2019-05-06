package com.yanfei1819.thymelafdemo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 追梦1819 on 2019-05-05.
 */
@Controller
public class IndexController {


    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/index2")
    public String index2(){
        return "index2";
    }


}
