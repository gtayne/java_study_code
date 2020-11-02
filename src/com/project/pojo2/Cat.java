package com.project.pojo2;

public class Cat extends com.project.pojo2.Animal {  //继承了父类Animal的属性和行为,如果不指定父类，
                                    // 默认继承Object类（java的顶父类）
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void eat(){}
    public void sleep(){}
}

