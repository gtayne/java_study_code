package com.project.pojo4;

public abstract class   Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void  eat();  //抽象方法 只有方法声明没有方法体，
                                    // 抽象方法一定要存在于抽象类中
                                    //抽象类中不一定有抽象方法
    public abstract void run();
}
