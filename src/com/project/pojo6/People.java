package com.project.pojo6;

public class People {
    private static People people;
    private People(){

    }
    public static People getInstance(){
        if(people==null) {  //如果为空值，赋值
            people = new People();
        }
            return people;
    }
}
