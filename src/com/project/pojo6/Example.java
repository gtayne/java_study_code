package com.project.pojo6;

public class Example {
    String str = new String("good");
    char[] ch = {'a','b','c'};

    public static void main(String[] args) {
        Example ex = new Example();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str+"and");
        System.out.println(ex.ch);
    }
    public void change(String str,char ch[]){
        str = "test ok";
        ch[0] = 'g';
    }
    public   Example(){
    }
    public Example(String str,char[] ch){
        this.str=str;
        this.ch=ch;
    }
}
