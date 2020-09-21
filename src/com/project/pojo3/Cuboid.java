package com.project.pojo3;

public class Cuboid extends Retangle {
    private int Height;

    public Cuboid(int length, int width,int height) {
        super(length, width);
        this.Height=height;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public void Cuboidarea() {
        System.out.println("长方体的面积为"+getLength()*getWidth()*getHeight());
    }
    public void CuboidBottomArea(){
        System.out.print("the bottom ");
        super.area();
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "Height=" + Height +
                '}'+super.toString();
    }
}
