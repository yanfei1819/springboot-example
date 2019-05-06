package com.yanfei1819.mybatisdemo.service;

import com.yanfei1819.mybatisdemo.entity.UserListResponse;
import com.yanfei1819.mybatisdemo.entity.UserResponse;

/**
 * Created by 追梦1819 on 2019-05-05.
 */
public interface UserService {

    UserListResponse queryUsers();
    UserResponse queryUserByName(String name);
}
