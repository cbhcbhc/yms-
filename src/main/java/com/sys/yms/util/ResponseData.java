package com.sys.yms.util;

import java.io.Serializable;

public class ResponseData implements Serializable {
    private String code;
    private String msg;
    private Object data;
    private Integer count;

    public ResponseData() {
    }

    public ResponseData(ResponseCode responseCode) {
        this.code =responseCode.getCode() ;
        this.msg = responseCode.getMsg();
    }

    public ResponseData(ResponseCode responseCode,Object data) {
        this.code =responseCode.getCode() ;
        this.msg = responseCode.getMsg();
        this.data = data;
    }

    public ResponseData(ResponseCode responseCode,Object data,Integer count) {
        this.code =responseCode.getCode() ;
        this.msg = responseCode.getMsg();
        this.data = data;
        this.count=count;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "ResponseData{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", count=" + count +
                '}';
    }
}
