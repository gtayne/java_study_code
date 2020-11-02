package com.project.pojo3;

public class Circle extends Shape{
    private int r;
    public Circle(int r){
        this.r=r;
    }
    public void MianJi(){
        System.out.println(3.14*r*r);
    }
    public void ZhouChang(){
        System.out.println(2*3.14*r);
    }
}

