package com.project.pojo3;

public class Car extends Vehicle{
    private int loader;

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    //·½·¨ÖØÐ´
    public String toString() {
        return "Car{" +
                "loader=" + loader +
                '}'+super.toString();
    }

    public void run(){
        System.out.println("car's run");
    }
}
