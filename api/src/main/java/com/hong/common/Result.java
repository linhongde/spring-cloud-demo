package com.hong.common;

import lombok.Data;

@Data
public class Result {

    private int code;

    private String message;

    private Object data;

    private String error;

    public Result(int code, String message, Object data, String error) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.error = error;
    }

    public Result() {
    }

    public static Result success(Object data){
        return new Result(200,"操作成功。",data,"");
    }
    public static Result fail(String message){
        return new Result(300,"操作失败。","",message);
    }

    public static Result error(String message){
        return new Result(500,"操作失败。",null,message);
    }

}
