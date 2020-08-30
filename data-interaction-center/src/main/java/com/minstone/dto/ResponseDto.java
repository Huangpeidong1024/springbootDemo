package com.minstone.dto;

import java.io.Serializable;

/**
 * @Description: 公共响应类
 * @Author: HuangPeiDong
 * @Date: 2020/8/30 10:43
 **/
public class ResponseDto<T> implements Serializable {

    private static final int CODE_SUCCESS = 200;

    private static final int CODE_FAIL = 500;

    private static final int CODE_ERROR = 500;

    private static final int CODE_NO_LOGIN = 300;

    private int code;

    private String msg;

    private T data;

    public ResponseDto(int code, String msg, T data) {
        this.setCode(code);
        this.setMsg(msg);
        this.setData(data);
    }

    public static <T> ResponseDto<T> success() {
        return new ResponseDto<T>(CODE_SUCCESS, "success", null);
    }

    public static <T> ResponseDto<T> success(String message) {
        return new ResponseDto<T>(CODE_SUCCESS, message, null);
    }

    public static <T> ResponseDto<T> success(T data) {
        return new ResponseDto<T>(CODE_SUCCESS, "success", data);
    }

    public static <T> ResponseDto<T> success(String message, T data) {
        return new ResponseDto<T>(CODE_SUCCESS, message, data);
    }

    public static <T> ResponseDto<T> error() {
        return new ResponseDto<T>(CODE_ERROR, "fail", null);
    }

    public static <T> ResponseDto<T> error(String message) {
        return new ResponseDto<T>(CODE_ERROR, message, null);
    }

    public static <T> ResponseDto<T> error(T data) {
        return new ResponseDto<T>(CODE_ERROR, "fail", data);
    }

    public static <T> ResponseDto<T> error(String message, T data) {
        return new ResponseDto<T>(CODE_ERROR, message, data);
    }

    public static <T> ResponseDto<T> badrequest() {
        return new ResponseDto<T>(CODE_FAIL, "no identifier arguments", null);
    }

    public static <T> ResponseDto<T> badrequest(String message) {
        return new ResponseDto<T>(CODE_FAIL, message, null);
    }

    public static <T> ResponseDto<T> badrequest(T data) {
        return new ResponseDto<T>(CODE_FAIL, "no identifier arguments", data);
    }

    public static <T> ResponseDto<T> badrequest(String message, T data) {
        return new ResponseDto<T>(CODE_FAIL, message, data);
    }

    public static <T> ResponseDto<T> noLogin(String message) {
        return new ResponseDto<T>(CODE_NO_LOGIN, message, null);
    }

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}