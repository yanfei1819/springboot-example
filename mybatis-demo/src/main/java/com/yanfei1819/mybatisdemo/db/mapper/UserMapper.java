package com.yanfei1819.mybatisdemo.db.mapper;

import com.yanfei1819.mybatisdemo.db.dto.UserDto;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 追梦1819 on 2019-05-05.
 */
public interface UserMapper {
    UserDto queryUserByName(@Param("name") String name);
}
