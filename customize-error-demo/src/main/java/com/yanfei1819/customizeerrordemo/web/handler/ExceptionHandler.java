package com.yanfei1819.customizeerrordemo.web.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 追梦1819 on 2019-05-09.
 */
@ControllerAdvice
public class ExceptionHandler {

    public ModelAndView handler(Exception e){
        ModelAndView model = new ModelAndView();
        model.addObject("msg",e.getMessage());
        return model;
    }
}
