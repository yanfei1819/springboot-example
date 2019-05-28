package com.yanfei1819.springbootmybatisthymeleafdemo.service;

import com.yanfei1819.springbootmybatisthymeleafdemo.entity.response.BaseResponse;
import com.yanfei1819.springbootmybatisthymeleafdemo.entity.vo.MobilePhoneVO;

import java.util.List;

/**
 * Created by 追梦1819 on 2019-05-27.
 */
public interface MobilePhoneService {
    List<MobilePhoneVO> listMobilePhones();
    MobilePhoneVO getMobilePhoneById(Long id);
    BaseResponse updateMobilePhone(MobilePhoneVO vo);
    BaseResponse insertMobilePhone(MobilePhoneVO vo);
    BaseResponse deleteMobilePhoneById(Long id);
}
