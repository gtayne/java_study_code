package com.project.pojo5;

public final class Test {
public static void main(String[] args) {
//        Person person =new Person();  //只要new一次对象，person就被加载到内存
//                                        //第二次new就直接从内存中取了
//        Student student = new Student();
        //父类类型 引用对象（记录对象在内存中分配的地址） = 子类对象
        Person   p1 = new Person();
        System.out.println(p1.A);

        }
        }
