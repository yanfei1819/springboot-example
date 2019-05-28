package com.yanfei1819.springbootmybatisthymeleafdemo.db.dao;

import com.yanfei1819.springbootmybatisthymeleafdemo.db.dto.MobilePhoneDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by 追梦1819 on 2019-05-27.
 */
@Mapper
public interface MobilePhoneDAO {

    @Select("select * from mobile_phone ")
    List<MobilePhoneDTO> listMobilePhones();

    @Select("select * from mobile_phone where id = #{id}")
    MobilePhoneDTO getMobilePhoneById(Long id);

    @Update("insert into mobile_phone(`name`,price,color,production_date) values(#{name},#{price},#{color},#{productionDate}")
    int insertMobilePhone(MobilePhoneDTO dto);

    @Update("UPDATE mobile_phone set `name`=#{name},price=#{price},color=#{color},production_date=#{productionDate} WHERE id=#{id}")
    int updateMobilePhone(MobilePhoneDTO dto);

    @Delete("DELETE FROM mobile_phone WHERE id = #{id}")
    int deleteMobilePhoneById(Long id);
}
