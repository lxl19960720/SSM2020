package com.stu.exception;

/**
 * @Author Lee
 * @Description 自定义异常类 用于记录异常信息
 * @Date 21:34 2020/1/5 0005
 **/
public class MyException extends Exception{
    //用于存储异常信息
    private String message;

    /**
     * @Author Lee
     * @Description 无参构造
     * @Date 21:40 2020/1/7 0007
     * @Param []
     * @return
     **/
    public MyException(){

    }

    /**
     * @Author Lee
     * @Description 有参构造
     * @Date 21:40 2020/1/7 0007
     * @Param [message]
     * @return
     **/
    public MyException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
