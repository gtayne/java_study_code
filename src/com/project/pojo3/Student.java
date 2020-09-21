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

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                '}'+super.toString();
    }
}
