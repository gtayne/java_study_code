package com.project.pojo3;

public class Retangle {
    private int length;
    private int width;
    public Retangle(){}
    public Retangle(int length,int width){
        this.length=length;
        this.width=width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void area(){
        System.out.println("area is "+ (width*length));
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
