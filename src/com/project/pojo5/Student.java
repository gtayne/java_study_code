package com.project.pojo5;

public class Student extends Person{
    private String no;
    static {
        System.out.println("����Student�ľ�̬�����");
    }
    {
        System.out.println("����Student�Ĺ�������");
    }
    public Student(){
        super();
        System.out.println("Studen���޲ι��췽��");
    }
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
