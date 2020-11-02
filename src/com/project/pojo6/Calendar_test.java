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
            System.out.println(d);   //Wed Oct 14 19:20:30 GMT+08:00 2020���ַ���
                                    //ת����
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //Wed Oct 14 21:17:32 GMT+08:00 2020
        Calendar calendar = Calendar.getInstance();  //����
        System.out.println(calendar.get(Calendar.YEAR));//2020��ֵʱֻ�������ͣ���֪��
                                                        //�ô�ʲôֵʱ�����Գ���ʹ��
                                                        //����.�Լ�����õĳ���
        System.out.println(calendar.get(Calendar.MONTH));  //9 ��Ϊ�Ǵ�0��ʼ
        System.out.println(calendar.get(Calendar.DATE));   //14
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));  //288
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));  //14
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));  //4  �����տ�ʼ��
        System.out.println(calendar.get(Calendar.HOUR));  //9
        System.out.println(calendar.get(Calendar.AM));  //1
        System.out.println(calendar.get(Calendar.AM_PM));  //1 �Ƿ�������֮ǰ��0
        System.out.println(calendar.get(Calendar.MINUTE));  //17
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));  //21
        System.out.println(calendar.get(Calendar.SECOND));  //10
        calendar.add(Calendar.YEAR,1); //����೤ʱ��֮�����ĸ�����
        calendar.add(Calendar.MONTH,2);
        calendar.add(Calendar.DAY_OF_YEAR,20);
        calendar.add(Calendar.MINUTE,23);
        System.out.println(calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"
        +calendar.get(Calendar.DATE)+" "+calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)
        +":"+calendar.get(Calendar.SECOND));
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM--DD HH:MM:ss");
        Date s =  calendar.getTime();  //gettime������ת��ΪDate��
        System.out.println(sdf.format(s));
        System.out.println("------------------------");
        calendar.set(Calendar.YEAR,1998);
        calendar.set(Calendar.MONTH,9);  //����������±꣬Ӧ��Ϊ�����·�-1
        calendar.set(Calendar.DATE,11);
        System.out.println(date2.format(calendar.getTime()));  //1998-10-11 11:10:17
        calendar.set(2008,7,16);
        System.out.println(date2.format(calendar.getTime()));  //2008-08-16 11:08:17
        String str2 = "2020-05-05 12:21:21";
        //�ַ���-->����-->����,�����������
        try {
           Date d = date2.parse(str2);  //ת��Ϊ����

            calendar.setTime(d);
            calendar.add(Calendar.YEAR,1);
            System.out.println(calendar);
            Calendar calendar2 = date2.getCalendar();  //date-->calendar��ȡ���һ��ͨ��format��������������
            System.out.println(calendar2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
