package com.project.pojo6;

import java.io.CharArrayReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar_test {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat date2  = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
        System.out.println(date2.format(date));
        String str = "2020-10-14 ";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d = format.parse(str);
            System.out.println(d);   //Wed Oct 14 19:20:30 GMT+08:00 2020传字符串
                                    //转日期
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //Wed Oct 14 21:17:32 GMT+08:00 2020
        Calendar calendar = Calendar.getInstance();  //单例
        System.out.println(calendar.get(Calendar.YEAR));//2020传值时只给了类型，不知道
                                                        //该传什么值时，可以尝试使用
                                                        //类名.自己定义好的常量
        System.out.println(calendar.get(Calendar.MONTH));  //9 因为是从0开始
        System.out.println(calendar.get(Calendar.DATE));   //14
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));  //288
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));  //14
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));  //4  从周日开始算
        System.out.println(calendar.get(Calendar.HOUR));  //9
        System.out.println(calendar.get(Calendar.AM));  //1
        System.out.println(calendar.get(Calendar.AM_PM));  //1 是否是中午之前？0
        System.out.println(calendar.get(Calendar.MINUTE));  //17
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));  //21
        System.out.println(calendar.get(Calendar.SECOND));  //10
        calendar.add(Calendar.YEAR,1); //计算多长时间之后是哪个日期
        calendar.add(Calendar.MONTH,2);
        calendar.add(Calendar.DAY_OF_YEAR,20);
        calendar.add(Calendar.MINUTE,23);
        System.out.println(calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"
        +calendar.get(Calendar.DATE)+" "+calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)
        +":"+calendar.get(Calendar.SECOND));
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM--DD HH:MM:ss");
        Date s =  calendar.getTime();  //gettime日历类转换为Date类
        System.out.println(sdf.format(s));
        System.out.println("------------------------");
        calendar.set(Calendar.YEAR,1998);
        calendar.set(Calendar.MONTH,9);  //这里给的是下标，应该为正常月份-1
        calendar.set(Calendar.DATE,11);
        System.out.println(date2.format(calendar.getTime()));  //1998-10-11 11:10:17
        calendar.set(2008,7,16);
        System.out.println(date2.format(calendar.getTime()));  //2008-08-16 11:08:17
        String str2 = "2020-05-05 12:21:21";
        //字符串-->日期-->日历,方便计算日期
        try {
           Date d = date2.parse(str2);  //转换为日期

            calendar.setTime(d);
            calendar.add(Calendar.YEAR,1);
            System.out.println(calendar);
            Calendar calendar2 = date2.getCalendar();  //date-->calendar获取最后一次通过format操作的日历对象
            System.out.println(calendar2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
