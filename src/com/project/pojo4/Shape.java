package com.project.pojo4;

public interface Shape extends A,B {   //多继承
    void shape();   //接口中的方法为public abstract抽象方法，没有方法体
    public static final int a = 10;
}
