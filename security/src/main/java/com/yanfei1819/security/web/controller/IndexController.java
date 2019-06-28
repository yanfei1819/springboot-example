package com.yanfei1819.security.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by 追梦1819 on 2019-06-27.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/springboot/{id}")
    public String springbootById(@PathVariable int id){
        return "springboot-"+id;
    }


    @GetMapping("/work/{id}")
    public String work(@PathVariable int id){
        return "work-"+id;
    }
}
