package com.project.pojo6;

public class MyException extends Exception {
    public MyException(){
        super("自己定义的异常"); //message

    }
    @Override
    public void printStackTrace() {
        System.out.println(getMessage());
    }
}
