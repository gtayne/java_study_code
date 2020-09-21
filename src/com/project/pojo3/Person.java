package com.project.pojo3;

public class Person {
    private String name;
    private  int age;
    private int height;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Person(){
        super();
    }
    public Person(String name,int age,int height){
        this.age=age;
        this.name=name;
        this.height=height;
    }
    public void eat(){
        System.out.println("person 吃的行为");
    }
    public void run(){
        System.out.println("person run的行为");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
