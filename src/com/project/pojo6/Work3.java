package com.project.pojo6;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

public class Work3 {
    public static void main(String[] args) {
        Integer a = new Integer(777); //new���󴴽�--�ŵ�����
        Integer b = 128;      //=���и�ֵ--�ŵ������أ���Χ8λ-128-127,Byte,Short
                                // ,Interger,Long�ķ�Χ��ͬ�� ���������ط�Χ
                                //�Ͳ���ͬһ��������
        Integer c1 = 128;
        Integer f = new Integer(777);
        System.out.println(a==f); //false
        System.out.println(b==c1);  //false

        Boolean bool = new Boolean(true);
        Boolean d = true;
        System.out.println(a.equals(777)); //true
        String aStr  =  a.toString();  //ת�����ַ���
        System.out.println("---------------------------");
        Integer[] e = new Integer[1];
        for (Integer s:e
             ) {
            System.out.println(s);  // null,null���ܵ�����
        }
        //�����������Ϳ����Զ�ת��Ϊ�����������ͣ����������������ͣ�
        int re = a;
        Integer re_i =  new Integer(re);
        System.out.println(re_i.equals(777));  //true
        String.valueOf(123);  //����������ת��Ϊ�ַ���
        System.out.println(Integer.parseInt("123456")); //���ַ���תΪ����
        //Integer���ж�Ӧ������
        Integer.max(1,2);
        Integer.sum(3,4);
        Integer.min(5,6);
        //Math��ר������������
        System.out.println("-----m----a----t-----h");
        System.out.println(Math.abs(-1)); //����ֵ
        System.out.println(Math.cos(1.732)); //���Ǻ���
        System.out.println(Math.ceil(8.001));  //����ȡ��
        System.out.println(Math.floor(8.9999)); //����ȡ��
        System.out.println(Math.PI); //��
        System.out.println(Math.pow(3,2)); //��һ������ƽ��
        System.out.println(Math.sqrt(81));  //��ƽ��
        System.out.println(Math.floorDiv(27,4));  //ǰ������沢����ȡ��
        System.out.println(Math.floorMod(27,4));  //��ģ
        System.out.println(Math.log(1)); //���� 0.0
        System.out.println(Math.E); //��Ȼ����
        System.out.println(Math.random()); //����double����0-1�������
        System.out.println(new Double(Math.floor(Math.random()*100)).intValue()%4);
        /*�����������������new Double��װ��intValue���䣬��4ȡ�࣬��ΧΪ0-3*/
        Random random = new Random(100L);  //����������ֵ�������ͬ�����ǵ������Ҳ��ͬ
        System.out.println(random.nextInt(200));  //ָ����Χ 115
        System.out.println(random.nextInt());   //-1139614796
        Random random1 = new Random(100L);
        System.out.println(random1.nextInt(200));  //115
        System.out.println("----------Decimalformat-----------------");
        BigDecimal decimal = new BigDecimal(new Double(0.01).toString());  //���ַ���ʱ�ȽϾ�׼
        BigDecimal decimal1 = new BigDecimal("0.05");
        decimal.add(decimal1);  //��
        decimal.subtract(decimal1);  //��
        decimal.multiply(decimal1);  //��
        decimal.divide(decimal1);  //��

        DecimalFormat df = new DecimalFormat("#,##0.00");
        double pi = 3.1415927;
        long c = 299792458;
        System.out.println(new DecimalFormat().format(pi));  //ָ��ΪDecimal��ʽ�����
        System.out.println(new DecimalFormat("#,##00.00").format(10012.99));  //1,000.99
        System.out.println("--------------------------");
        System.out.println(new DecimalFormat("0").format(pi));  //3 ȡһλ����
        System.out.println(new DecimalFormat("0.00").format(pi));  //3.14  ȡһλ��������λС��
        System.out.println(new DecimalFormat("00.000").format(pi)); //03.142 ȡ��λ��������λС�������㲿����0�
        System.out.println(new DecimalFormat("#").format(pi)); //3 ȡ������������
        System.out.println(new DecimalFormat("#.##%").format(pi)); //�԰ٷֱ���ʽ��������ȡ��λС��
        System.out.println(new DecimalFormat("#.#####E0").format(c));  //2.99792E8 �Կ�ѧ������������ȥ����С��
        System.out.println(new DecimalFormat("00.####E0").format(c));  //29.9792E7 �Կ�ѧ������������ȡ��λ��������λС��
        System.out.println(new DecimalFormat(",###").format(c));  // 299,792,458 ÿ��λ�Զ��ŷָ�
        System.out.println(new DecimalFormat("���ٴ�СΪÿ��,###��").format(c)); //���ٴ�СΪÿ��299,792,458��
        System.out.println(new DecimalFormat("#,##").format(c));



    }


}

