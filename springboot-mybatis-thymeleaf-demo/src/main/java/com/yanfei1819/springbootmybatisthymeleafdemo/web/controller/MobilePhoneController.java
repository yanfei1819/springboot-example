package com.yanfei1819.springbootmybatisthymeleafdemo.web.controller;

import com.yanfei1819.springbootmybatisthymeleafdemo.entity.response.BaseResponse;
import com.yanfei1819.springbootmybatisthymeleafdemo.entity.vo.MobilePhoneVO;
import com.yanfei1819.springbootmybatisthymeleafdemo.service.MobilePhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 追梦1819 on 2019-05-27.
 */
@Controller
@RequestMapping("/mobile/phone")
public class MobilePhoneController {

    @Autowired
    private MobilePhoneService service;

    @GetMapping("/listMobilePhones")
    public String listMobilePhones(Model model){
        List<MobilePhoneVO> vos = service.listMobilePhones();
        model.addAttribute("response",vos);
        return "mobilephoneList";
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public BaseResponse getMobilePhoneById(@PathVariable Long id){
        MobilePhoneVO vo = service.getMobilePhoneById(id);
        return new BaseResponse(vo);
    }

    @PostMapping("/insertMobilePhone")
    @ResponseBody
    public BaseResponse insertMobilePhone(@RequestBody MobilePhoneVO vo){
        return service.insertMobilePhone(vo);
    }

    @GetMapping("/toEditMobilePhone")
    public String toAddMobilePhone(Model model,Long id){
        MobilePhoneVO vo = service.getMobilePhoneById(id);
        model.addAttribute("vo",vo);
        return "toEditMobilePhone";
    }

    @PostMapping("/updateMobilePhone")
    @ResponseBody
    public String updateMobilePhone(@RequestBody MobilePhoneVO vo){
        service.updateMobilePhone(vo);
        return "redirect:mobilephoneList";
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public BaseResponse deleteMobilePhoneById(@PathVariable Long id){
        return service.deleteMobilePhoneById(id);
    }
}
