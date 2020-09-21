package com.project.pojo3;


import com.project.pojo3.Person;

public class Test3 {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.setAge(10);
//        p1.setHeight(120);
//        p1.setName("张三");
//        System.out.println(p1);
//
//        Man man = new Man();
//        man.setAge(20);
//        man.setName("李四");
//        man.setHair("短");
//        System.out.println(man);
//
//        Man man1 = new Man();
//        man1.setName("赵六");
//
//
//        Student student = new Student();
//        student.setAge(15);
//        student.setName("王五");
//        student.setNo(1001);
//        System.out.println(student);
        Person p1 = new Person();
        Person p2 = new Man(); //父类类型接收子类对象，叫做向上转型
        Object p3 = new Man();
        p2.setAge(1);
        p2.setHeight(160);
        p2.setName("abc");
        ((Man)p2).setHair("长"); //此句相当于 Man man = (Man) p2; Man.setHair("长");
        System.out.println("---------------------");
        //Man man1 = (Man) new Person();
        //判断 对象是不是一个类型  对象 instanceof 类型
        Person per = new Man();
        if(per instanceof Man){
            Man man1 = (Man) per;
            System.out.println(man1);
        }else {
            System.out.println("不是这个类型，不可转换");
        }







    }
}
