package com.project.pojo3;

import com.project.pojo3.Person;

public class Man extends Person {
    private String hair;
    public Man(){
        super();
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public void eat(){
        System.out.println("man chide duo");
    }
    public void run(){
        System.out.println("man paode kuai");
    }
    @Override
    public String toString() {
        return "Man{" +
                "hair='" + hair + '\'' +
                '}'+super.toString();
    }
}
