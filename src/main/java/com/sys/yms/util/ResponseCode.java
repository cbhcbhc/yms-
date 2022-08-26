package com.sys.yms.util;

/**
 * 响应码和描述
 */
public enum ResponseCode {
    SUCCESS("0","请求成功"),
    ERROR_1("9001","账号密码错误"),
    ERROR_2("9002","添加数据异常"),
    ERROR_3("9003","修改数据异常"),
    ERROR_4("9004","删除数据异常"),
    ERROR_5("9005","上传失败"),
    FAIL("9999","网络异常");

    private String code;
    private String msg;

    ResponseCode() {
    }

    ResponseCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
