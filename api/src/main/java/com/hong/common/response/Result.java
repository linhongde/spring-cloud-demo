package com.hong.common.response;

public class Result<T> {
    /**
     * 响应数据
     */
    private T data;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 响应状态
     */
    private int code;

    /**
     * 错误信息
     */
    private String errorMessage;


    public Result(T data, String message, int code, String errorMessage) {
        this.data = data;
        this.message = message;
        this.code = code;
        this.errorMessage = errorMessage;
    }

    public static Result ok(Object data){
        return new Result(data,"成功",200,"");
    }

    public static Result ok(){
        return new Result(true,"成功",200,"");
    }

    public static Result fail(String errorMessage){
        return new Result("","失败",500,errorMessage);
    }

    public static Result fail(){
        return new Result(false,"失败",500,"");
    }
}