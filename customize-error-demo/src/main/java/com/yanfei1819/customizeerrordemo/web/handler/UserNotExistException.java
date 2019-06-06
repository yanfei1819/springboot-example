package com.yanfei1819.customizeerrordemo.web.handler;

/**
 * Created by 追梦1819 on 2019-06-06.
 */
public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("用户不存在");
    }
}
