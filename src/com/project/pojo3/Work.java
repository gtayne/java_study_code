package com.project.pojo3;

import java.sql.SQLOutput;

public class Work {
    public static void main(String[] args) {
        Vehicle v1= new Vehicle();
        v1.setBrand("benz");
        v1.setColor("red");
        v1.setSpeed(112);
        v1.run();
        System.out.println(v1);
        System.out.println("--------------------");

        Vehicle c1=new Car();
        //c1.setLoader(4);
        c1.setBrand("honda");
        c1.setColor("black");
        c1.setSpeed(110);
        c1.run(); // car's run
        System.out.println(c1);
        System.out.println("--------------------");
        Dog dog = new Dog();
        dog.setType("นท");
        dog.eat();

        System.out.println("--------------------");
        Cuboid cube1 = new Cuboid(1,2,3);
        cube1.Cuboidarea();
        cube1.CuboidBottomArea();
        System.out.println(cube1);
    }
}
