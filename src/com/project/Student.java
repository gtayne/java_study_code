package com.project;
public class Student {
    //私有特征，可以在自己类中使用，出了个类就不能使用了（在别的类中就.不到了)
    //private 访问权限修饰符 私有的特征叫做属性
    //publiac 公开的，在当前项目下公共的内容都可以被访问
    private String no;
    private String name;
    private int  score;

    public void setScore(int score1){
        if(score1>0) {
            score = score1;
        }else{
            score=0;
        }
    }
    public void setName(String name1){
        name=name1;
    }
    public void setNo(String no1){
        no=no1;
    }
    public void print() {
        System.out.println("------------------");
        System.out.println("学生的学号是" + no);
        System.out.println("学生的姓名是" + name);
        System.out.println("学生的成绩是" + score);
    }
    public String toString(){  //对象的变量打印时，默认调用toString
        return no+name+score;
    }

    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public String getNo(){
        return no;
    }
}

