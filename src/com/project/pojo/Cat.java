package com.project.pojo;

public class Cat {
    private String nikeName;
    private int age;
    private int length;
    public Cat(String nikeName1,int age1,int length1){    //�вι��췽��
        nikeName=nikeName1;
        age=age1;
        length=length1;
    }
    public Cat(){   //�޲Σ���ͬ�ķ�������������ͬ�������б�Ҳ��ͬ

    }
    public void setNikeName(String nikeName1){
        nikeName=nikeName1;
    }
    public void setAge(int age1){
        age=age1;
    }
    public void setLength(int length1){
        length=length1;
    }

    public String getNikeName(){
        return nikeName;
    }

    public int getAge(){
        return age;
    }

    public int getLength(){
        return length;
    }

    public  String toString(){
        return "cat's info "+" name:"+nikeName+" age:"+age+" length:"+length;
    }
}
