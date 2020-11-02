package com.project.pojo4;

import com.project.pojo3.Woman;

public class test {
    public static void a(Person p){
        p.eat();
    }
//    public static Person (int a ){
//        if(a==1){
//            System.out.println("没有该类型");
//        }else{
//            return new Person();
//        }
//    }
    public static void main(String[] args) {

        Person ps1 = new Person() {   //抽象类不能直接创建对象,创建对象时最好使用子类
                                    //向上转型
            @Override
            public void eat() {

            }

            @Override
            public void run() {

            }
        };

        Person p1 = new Man();
        p1.eat();
        Person p2 = new Man();
        p2.eat();

    }
    }
