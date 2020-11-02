package com.project.pojo2;

import com.project.pojo3.Circle;
import com.project.pojo3.Shape;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal.sleep();

        Shape shape = new Circle(20);
        shape.ZhouChang();
    }
}
