package com.yanfei1819.mybatismapperdemo.dao;

import com.yanfei1819.mybatismapperdemo.entity.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by 追梦1819 on 2019-05-07.
 */
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {
}
