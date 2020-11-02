package com.project.pojo6;


import org.w3c.dom.css.CSSImportRule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);  //Tue Oct 06 13:22:55 GMT+08:00 2020
        Person person = new Person();
        person.setBirthday(date);
        person.setName("1234");
        person.setSex("nan");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /*M代表月份m代表分钟，H代表24小时制，h代表12小时制。
         * y代表年份  d代表一个月的第几天 D代表一年的第几天
         * S代表毫秒值 s代表秒值*/
        String formatDate = format.format(date);
        System.out.println(formatDate);
        String str = "2020-10-6 13:44:35";
        try {
            Date d1 = format.parse(str);
            System.out.println(d1);  //Tue Oct 06 13:44:35 GMT+08:00 2020
            System.out.println(d1.after(date));  // false 判断给的日期是否在现在日期的后面
            System.out.println(d1.before(date));  // true 判断给的日期是否在现在日期的前面
            System.out.println(d1.compareTo(date)); //-1 在后-1，相等0 在前为1
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
