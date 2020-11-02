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
        /*M�����·�m������ӣ�H����24Сʱ�ƣ�h����12Сʱ�ơ�
         * y�������  d����һ���µĵڼ��� D����һ��ĵڼ���
         * S�������ֵ s������ֵ*/
        String formatDate = format.format(date);
        System.out.println(formatDate);
        String str = "2020-10-6 13:44:35";
        try {
            Date d1 = format.parse(str);
            System.out.println(d1);  //Tue Oct 06 13:44:35 GMT+08:00 2020
            System.out.println(d1.after(date));  // false �жϸ��������Ƿ����������ڵĺ���
            System.out.println(d1.before(date));  // true �жϸ��������Ƿ����������ڵ�ǰ��
            System.out.println(d1.compareTo(date)); //-1 �ں�-1�����0 ��ǰΪ1
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
