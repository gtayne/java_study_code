package com.project.pojo4;

public class Circle extends Person implements Shape{  //实现类

    public static int[]  a  ;
    private  int r;
    static {
        a=new int[10];
//        for (int i = 0; i < a.length; i++) {
//            a[i]=i*10;
//        }
        System.out.println("这个是Circle类的静态代码块");
    }
    {
        System.out.println("Circle 构造代码块");
    }
    public static void  cir(){
        System.out.println("circle中的static方法");
    }
    @Override
    public void shape() {

    }

    @Override
    public void test() {

    }

    @Override
    public void b() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void run() {

    }

    public int   getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    public Circle(){
        System.out.println("Circle的构造方法");
    }
}
