package com.project.pojo4;

import com.project.pojo3.Woman;

public class test {
    public static void a(Person p){
        p.eat();
    }
//    public static Person (int a ){
//        if(a==1){
//            System.out.println("û�и�����");
//        }else{
//            return new Person();
//        }
//    }
    public static void main(String[] args) {

        Person ps1 = new Person() {   //�����಻��ֱ�Ӵ�������,��������ʱ���ʹ������
                                    //����ת��
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
