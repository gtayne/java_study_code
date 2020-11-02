package com.project.pojo3;

public class Rectangle extends Shape{
    private int width;
    private int length;
    public  Rectangle(int width,int length){
        this.width=width;
        this.length=length;
    }
    public void ZhouChang(){
        System.out.println((width+length)*2);
    }

    public void MianJi() {
        System.out.println(width*length);
    }
}
