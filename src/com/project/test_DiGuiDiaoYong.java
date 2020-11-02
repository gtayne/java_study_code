package com.project;

public class test_DiGuiDiaoYong {
    public static void main(String[] args) {
        int n=5;
        int result = accumulate(n);  //计算了5次
        System.out.println(result);
        Cat c = new Cat();
        c.age=1;
        c.length=20;
        c.nickname="tom";
    }

    public static int accumulate(int n){
        if(n==1){
            return 1;  //
        }
        return n+ accumulate(n-1); //递归的调用了自己5次
    }
}

