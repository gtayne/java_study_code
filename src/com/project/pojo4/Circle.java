package com.project.pojo4;

public class Circle extends Person implements Shape{  //ʵ����

    public static int[]  a  ;
    private  int r;
    static {
        a=new int[10];
//        for (int i = 0; i < a.length; i++) {
//            a[i]=i*10;
//        }
        System.out.println("�����Circle��ľ�̬�����");
    }
    {
        System.out.println("Circle ��������");
    }
    public static void  cir(){
        System.out.println("circle�е�static����");
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
        System.out.println("Circle�Ĺ��췽��");
    }
}
