package com.yanfei1819.springbootmybatisthymeleafdemo.service.impl;

import com.yanfei1819.springbootmybatisthymeleafdemo.db.dao.MobilePhoneDAO;
import com.yanfei1819.springbootmybatisthymeleafdemo.db.dto.MobilePhoneDTO;
import com.yanfei1819.springbootmybatisthymeleafdemo.entity.response.BaseResponse;
import com.yanfei1819.springbootmybatisthymeleafdemo.entity.vo.MobilePhoneVO;
import com.yanfei1819.springbootmybatisthymeleafdemo.service.MobilePhoneService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 追梦1819 on 2019-05-27.
 */
@Service
public class MobilePhoneServiceImpl implements MobilePhoneService {

    @Autowired
    private MobilePhoneDAO mobilePhoneDAO;

    @Override
    public List<MobilePhoneVO> listMobilePhones() {
        List<MobilePhoneDTO> dtos = mobilePhoneDAO.listMobilePhones();
        List<MobilePhoneVO> vos = new ArrayList<>();
        for (MobilePhoneDTO dto : dtos) {
            MobilePhoneVO vo = new MobilePhoneVO();
            BeanUtils.copyProperties(dto,vo);
            vos.add(vo);
        }
        return vos;
    }

    @Override
    public MobilePhoneVO getMobilePhoneById(Long id) {
        MobilePhoneDTO dto = mobilePhoneDAO.getMobilePhoneById(id);
        MobilePhoneVO vo = new MobilePhoneVO();
        BeanUtils.copyProperties(dto,vo);
        return vo;
    }

    @Override
    public BaseResponse updateMobilePhone(MobilePhoneVO vo) {
        MobilePhoneDTO dto = new MobilePhoneDTO();
        BeanUtils.copyProperties(vo,dto);
        int updateCount = mobilePhoneDAO.updateMobilePhone(dto);
        if(updateCount<1){
            return new BaseResponse("数据更新失败");
        }

        return new BaseResponse();
    }

    @Override
    public BaseResponse insertMobilePhone(MobilePhoneVO vo) {
        MobilePhoneDTO dto = new MobilePhoneDTO();
        BeanUtils.copyProperties(vo,dto);
        int insertCount = mobilePhoneDAO.insertMobilePhone(dto);
        if(insertCount<1){
            return new BaseResponse("数据插入失败");
        }

        return new BaseResponse();
    }

    @Override
    public BaseResponse deleteMobilePhoneById(Long id) {
        int deleteCount = mobilePhoneDAO.deleteMobilePhoneById(id);
        if(deleteCount<1){
            return new BaseResponse("数据删除失败");
        }
        return new BaseResponse();
    }
}
