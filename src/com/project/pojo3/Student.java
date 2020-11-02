package com.project.pojo3;

import com.project.pojo3.Person;

public class Student extends Person {
    private int no;
    public Student(){
        super();
    }
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
    public void eat(){
        System.out.println("student eat method");
    }
    public void run(){
        System.out.println("student eat method ");
    }
    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                '}'+super.toString();
    }
}
