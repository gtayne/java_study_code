package com.project.pojo5;

public class Student extends Person{
    private String no;
    static {
        System.out.println("这是Student的静态代码块");
    }
    {
        System.out.println("这是Student的构造代码块");
    }
    public Student(){
        super();
        System.out.println("Studen的无参构造方法");
    }
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
