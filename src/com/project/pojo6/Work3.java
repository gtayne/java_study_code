package com.project.pojo6;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

public class Work3 {
    public static void main(String[] args) {
        Integer a = new Integer(777); //new对象创建--放到堆里
        Integer b = 128;      //=运行赋值--放到常量池（范围8位-128-127,Byte,Short
                                // ,Interger,Long的范围相同） 超出常量池范围
                                //就不是同一个对象了
        Integer c1 = 128;
        Integer f = new Integer(777);
        System.out.println(a==f); //false
        System.out.println(b==c1);  //false

        Boolean bool = new Boolean(true);
        Boolean d = true;
        System.out.println(a.equals(777)); //true
        String aStr  =  a.toString();  //转换成字符串
        System.out.println("---------------------------");
        Integer[] e = new Integer[1];
        for (Integer s:e
             ) {
            System.out.println(s);  // null,null不能调方法
        }
        //基本数据类型可以自动转换为引用数据类型，接收引用数据类型，
        int re = a;
        Integer re_i =  new Integer(re);
        System.out.println(re_i.equals(777));  //true
        String.valueOf(123);  //将各种类型转换为字符串
        System.out.println(Integer.parseInt("123456")); //将字符串转为数字
        //Integer中有对应的运算
        Integer.max(1,2);
        Integer.sum(3,4);
        Integer.min(5,6);
        //Math类专门做数据运算
        System.out.println("-----m----a----t-----h");
        System.out.println(Math.abs(-1)); //绝对值
        System.out.println(Math.cos(1.732)); //三角函数
        System.out.println(Math.ceil(8.001));  //向上取整
        System.out.println(Math.floor(8.9999)); //向下取整
        System.out.println(Math.PI); //π
        System.out.println(Math.pow(3,2)); //求一个数的平方
        System.out.println(Math.sqrt(81));  //开平方
        System.out.println(Math.floorDiv(27,4));  //前面除后面并向下取整
        System.out.println(Math.floorMod(27,4));  //求模
        System.out.println(Math.log(1)); //对数 0.0
        System.out.println(Math.E); //自然对数
        System.out.println(Math.random()); //返回double类型0-1的随机数
        System.out.println(new Double(Math.floor(Math.random()*100)).intValue()%4);
        /*返回整数的随机数，new Double包装后intValue拆箱，对4取余，范围为0-3*/
        Random random = new Random(100L);  //如果两个数字的种子相同，他们的随机数也相同
        System.out.println(random.nextInt(200));  //指定范围 115
        System.out.println(random.nextInt());   //-1139614796
        Random random1 = new Random(100L);
        System.out.println(random1.nextInt(200));  //115
        System.out.println("----------Decimalformat-----------------");
        BigDecimal decimal = new BigDecimal(new Double(0.01).toString());  //用字符串时比较精准
        BigDecimal decimal1 = new BigDecimal("0.05");
        decimal.add(decimal1);  //加
        decimal.subtract(decimal1);  //减
        decimal.multiply(decimal1);  //乘
        decimal.divide(decimal1);  //除

        DecimalFormat df = new DecimalFormat("#,##0.00");
        double pi = 3.1415927;
        long c = 299792458;
        System.out.println(new DecimalFormat().format(pi));  //指定为Decimal格式化输出
        System.out.println(new DecimalFormat("#,##00.00").format(10012.99));  //1,000.99
        System.out.println("--------------------------");
        System.out.println(new DecimalFormat("0").format(pi));  //3 取一位整数
        System.out.println(new DecimalFormat("0.00").format(pi));  //3.14  取一位整数，两位小数
        System.out.println(new DecimalFormat("00.000").format(pi)); //03.142 取两位整数，三位小数，不足部分以0填补
        System.out.println(new DecimalFormat("#").format(pi)); //3 取所有整数部分
        System.out.println(new DecimalFormat("#.##%").format(pi)); //以百分比形式计数，并取两位小数
        System.out.println(new DecimalFormat("#.#####E0").format(c));  //2.99792E8 以科学计数法计数，去武威小数
        System.out.println(new DecimalFormat("00.####E0").format(c));  //29.9792E7 以科学计数法计数，取两位整数，四位小数
        System.out.println(new DecimalFormat(",###").format(c));  // 299,792,458 每三位以逗号分割
        System.out.println(new DecimalFormat("光速大小为每秒,###米").format(c)); //光速大小为每秒299,792,458米
        System.out.println(new DecimalFormat("#,##").format(c));



    }


}

