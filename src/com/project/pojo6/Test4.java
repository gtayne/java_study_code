package com.project.pojo6;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Test4 {
    public static void ab(int a) throws MyException{
        if(a<0){
            try {
                throw new MyException();
            } catch (MyException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(a);
        }
    }
    public static void main(String[] args) throws MyException{
//        ArrayIndexOutOfBoundsException arr = new ArrayIndexOutOfBoundsException();
//        System.out.println(arr.getMessage());
//        try {
//            throw new ArrayIndexOutOfBoundsException(); //抛出数组越界异常
//        }catch (ArrayIndexOutOfBoundsException e ){
//            e.printStackTrace();
//        }
        ab(-1);  //自己定义的异常
    }

}
