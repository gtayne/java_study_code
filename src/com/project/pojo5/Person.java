package com.project.pojo5;

public  class Person {
    private int age;
    private String name;
    static final int A ;
    static final int[] ARR={2,3,4,6};
    public int getAge() {
        return age;
    }
    static {
        A=20;  //�涨  �������������ֵ
        for (int i = 0; i < ARR.length; i++) {
            ARR[i]=i*10;
        }
        System.out.println("����Person�ľ�̬����飬�������ʱִ��һ��");
    }
    {
        System.out.println("����Person�Ĺ�������");
    }
    public Person(){
            System.out.println("����Person���޲ι��췽��");
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
