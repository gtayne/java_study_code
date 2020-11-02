package com.project.pojo7;

public class AgeHeightException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("年龄高的异常 ");
    }
}
