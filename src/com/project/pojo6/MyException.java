package com.project.pojo6;

public class MyException extends Exception {
    public MyException(){
        super("�Լ�������쳣"); //message

    }
    @Override
    public void printStackTrace() {
        System.out.println(getMessage());
    }
}
