package com.yanfei1819.springbootmybatisthymeleafdemo.entity.response;

/**
 * Created by 追梦1819 on 2019-05-27.
 */
public class BaseResponse<T> {
    private Integer code;
    private String msg;

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static BaseResponse defaultNo(String msg) {
        return new BaseResponse(1,msg);
    }

    public static BaseResponse defaultOk() {
        return new BaseResponse();
    }


    public BaseResponse() {
        this.code = 0;
        this.msg = "success";
    }

    public BaseResponse(String msg) {
        this.code = 1;
        this.msg = msg;
    }

    public BaseResponse(T data) {
        this.data = data;
        this.code = 0;
        this.msg = "success";
    }

    public BaseResponse(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
