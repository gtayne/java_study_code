package com.project.pojo6;


public class Test {
    public static void main(String[] args) {
        //java lang包下不需要导包
        String str = new String("gaotianyu");
        String s2 = "http://localhost/abc.txt";
        String s1= "abc";
        String s3 = "   前面有空格";
        String s5 = "abc";
        //将字符串串转成字节数组
        byte[] b2 =str.getBytes();
        //将字符串转成字节数组
        char[] c1= str.toCharArray();
        //byte/char[] ---> String 字符/字节数组与字符串的转换
        byte[] bytes = new byte[10];
        String s =new String(bytes);
        char[] chars = new char[10];
        String sc = new String(chars);
        System.out.println(s2.charAt(0)); //返回指定索引位置上的字符，从0开始 -->h
        System.out.println(s2.concat("iamwho")); //字符串拼接  -->http://localhost/abc.txtiamwho
        System.out.println(s2.endsWith("ami"));//是否与某个字符串结束的true|false ---false
        System.out.println(s2.startsWith("who"));//是否以某个字符串开始  --->false
        System.out.println(s2.indexOf(97));  //找数字对应的字符（索引）97(a)的位置-->10
        System.out.println(s2.indexOf(97,2)); //找从第13个字符开始的索引位置  -->10
                                                            //找不到返回-1,只是开始的位置改
                                                            //变了，位置不变-->10

        System.out.println(s2.indexOf("a"));   //-->17
        System.out.println(s2.lastIndexOf("a")); //字符串最后一次出现的位置,从右到左开始找-->17
        System.out.println(s2.lastIndexOf("a",11));  //从4开始，第一次最后出现的位置-->10
        System.out.println(s2.lastIndexOf(97,15)); //-->10
        System.out.println(s2.lastIndexOf(".")); //-->20
        System.out.println(s2.substring(s2.lastIndexOf(".")+1)); //截取.后面的内容 -->txt
        System.out.println(s2.substring(0,4)); //http 0-4索引的内容 -->http
        System.out.println("---------------------------------");
        System.out.println(s2.length());//获取字符串长度  -->24
        System.out.println(s1.isEmpty()); //判断字符串是否为空串  -->true 
        System.out.println(s2.replace("txt","html")); //替换字符串  -->http://localhost/abc.html
        String[] s4 = s2.split("t",2);  //limit限制切割字符串的个数 -->h 换行 tp://localhost/abc.txt
        for (String ss:s4
             ) {
            System.out.println(ss);
        }
        System.out.println("---------------------------------");
        System.out.println(s2.replaceFirst("t","s")); //hstp://localhost/abc.txt
        //用一个字符串去替代指定字符，且只替代第一个字符
        System.out.println(s2.replaceAll("t","a")); //haap://localhosa/abc.axa
        System.out.println(s2.toUpperCase());  //转为大写字符  --> HTTP://LOCALHOST/ABC.TXT
        System.out.println(s3.trim()); //去掉前后空格 -->前面有空格
        System.out.println("--------------------------");
        System.out.println(sc);
        System.out.println(s);
        System.out.println(str);
        System.out.println("--------------------------");
        //equals方法为object内的方法，比较引用数据类型，string内做了方法重写,==相当于关系运算符
        //比较基本数据类型的值时，判断两个值是否相等   ==引用数据类型 判断的是地址
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2));  //false
        System.out.println(s5.equals("abc"));  //比较两个字符串,返回true|false
        System.out.println(s1.equalsIgnoreCase("ABC")); //忽略大小写比较字符串
        System.out.println("-----------s----b------r----------------");
        StringBuilder sbr = new StringBuilder(30);
        sbr.append("asdjkltws");
        sbr.replace(0,1,"!!!");  //!!!sdjkltws
        sbr.insert(0,"~~~");  //~~~!!!sdjkltws
        sbr.delete(0,3);            //!!!sdjkltws
        System.out.println(sbr);
        System.out.println(sbr.capacity());  //3o，构建方法中指定容量

        StringBuffer sbr1 = new StringBuffer();  //用法基本与StringBuilder相同，
                                                //都是在原来字符串上进行字符拼接
        sbr1.append("abcsjis");
    }
}
