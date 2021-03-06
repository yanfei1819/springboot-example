package com.yanfei1819.mybatisdemo.entity;

import com.yanfei1819.mybatisdemo.db.dto.UserDto;

import java.util.List;

/**
 * Created by 追梦1819 on 2019-05-05.
 */
public class UserListResponse {
    private int code;
    private String msg;
    private List<UserDto> users;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<UserDto> getUsers() {
        return users;
    }

    public void setUsers(List<UserDto> users) {
        this.users = users;
    }
}
