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
        A=20;  //规定  变量必须有最后值
        for (int i = 0; i < ARR.length; i++) {
            ARR[i]=i*10;
        }
        System.out.println("这是Person的静态代码块，在类加载时执行一次");
    }
    {
        System.out.println("这是Person的构造代码块");
    }
    public Person(){
            System.out.println("这是Person的无参构造方法");
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
