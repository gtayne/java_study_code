package com.project.pojo6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws ParseException,Exception{ //表明在方法执行时，可能会出现parseException异常
        String str = "2020-11-11 ";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        date=format.parse(str);
        System.out.println(date.getTime());
        try {
            Date date1 = format.parse(str);  //非运行时异常，可能会出现错误信息，提前做的提示

        } catch (ParseException e) {
            e.printStackTrace();
        }finally {
            System.out.println("final 代码块中的代码执行了");
        }
    }
}
