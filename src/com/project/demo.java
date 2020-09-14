package com.project;

public class demo{
    public static void sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<=arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
    public static int  serach(int arr[],int num){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int middle = (start+end)/2;
            if(num==arr[middle]){
                return middle;
            }else if(num>arr[middle]){
                start=middle+1;
            }else if(num<arr[middle]){
                end=middle-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arrs[]= {0,3,9,12,77,100};
        int b = serach(arrs,12);
        System.out.println(b);
        for(int a:arrs){
            System.out.println(a);
        }
    }

}
