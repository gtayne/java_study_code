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
    public abstract void  eat();  //���󷽷� ֻ�з�������û�з����壬
                                    // ���󷽷�һ��Ҫ�����ڳ�������
                                    //�������в�һ���г��󷽷�
    public abstract void run();
}
