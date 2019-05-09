package com.yanfei1819.jspdemo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 追梦1819 on 2019-05-08.
 */
@Controller
public class JSPController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("name","SpringBoot");
        return "index";
    }
}
