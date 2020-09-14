package com.project;

public class function_review {
    public static int sum(int a,int b){
        int c = a+b;
        System.out.println(c);
        return c;
    }

    public static long sum(long a,long b){
        long d = a+b;
        System.out.println(d);
        return d;
    }

    public static void  main(String args[]){

        sum(1,2);
        long c = 1L;
        long d = 2L;
        long e = sum(c,d);
        int arr2[]={7,6,9,12,56,78,112};
        int b = demo.serach(arr2,1);  //调用其他函数内的方法
        System.out.println(b);
        if(b==-1){
            System.out.println("查找的值不存在");
        }
    }
}
