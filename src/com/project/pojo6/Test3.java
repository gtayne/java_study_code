package com.project.pojo6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws ParseException,Exception{ //�����ڷ���ִ��ʱ�����ܻ����parseException�쳣
        String str = "2020-11-11 ";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        date=format.parse(str);
        System.out.println(date.getTime());
        try {
            Date date1 = format.parse(str);  //������ʱ�쳣�����ܻ���ִ�����Ϣ����ǰ������ʾ

        } catch (ParseException e) {
            e.printStackTrace();
        }finally {
            System.out.println("final ������еĴ���ִ����");
        }
    }
}
