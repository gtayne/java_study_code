package com.project.pojo6;

public class People {
    private static People people;
    private People(){

    }
    public static People getInstance(){
        if(people==null) {  //���Ϊ��ֵ����ֵ
            people = new People();
        }
            return people;
    }
}
