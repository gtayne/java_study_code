package com.project.pojo3;


import com.project.pojo3.Person;

public class Test3 {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.setAge(10);
//        p1.setHeight(120);
//        p1.setName("����");
//        System.out.println(p1);
//
//        Man man = new Man();
//        man.setAge(20);
//        man.setName("����");
//        man.setHair("��");
//        System.out.println(man);
//
//        Man man1 = new Man();
//        man1.setName("����");
//
//
//        Student student = new Student();
//        student.setAge(15);
//        student.setName("����");
//        student.setNo(1001);
//        System.out.println(student);
        Person p1 = new Person();
        Person p2 = new Man(); //�������ͽ���������󣬽�������ת��
        Object p3 = new Man();
        p2.setAge(1);
        p2.setHeight(160);
        p2.setName("abc");
        ((Man)p2).setHair("��"); //�˾��൱�� Man man = (Man) p2; Man.setHair("��");
        System.out.println("---------------------");
        //Man man1 = (Man) new Person();
        //�ж� �����ǲ���һ������  ���� instanceof ����
        Person per = new Man();
        if(per instanceof Man){
            Man man1 = (Man) per;
            System.out.println(man1);
        }else {
            System.out.println("����������ͣ�����ת��");
        }







    }
}
