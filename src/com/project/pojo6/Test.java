package com.project.pojo6;


public class Test {
    public static void main(String[] args) {
        //java lang���²���Ҫ����
        String str = new String("gaotianyu");
        String s2 = "http://localhost/abc.txt";
        String s1= "abc";
        String s3 = "   ǰ���пո�";
        String s5 = "abc";
        //���ַ�����ת���ֽ�����
        byte[] b2 =str.getBytes();
        //���ַ���ת���ֽ�����
        char[] c1= str.toCharArray();
        //byte/char[] ---> String �ַ�/�ֽ��������ַ�����ת��
        byte[] bytes = new byte[10];
        String s =new String(bytes);
        char[] chars = new char[10];
        String sc = new String(chars);
        System.out.println(s2.charAt(0)); //����ָ������λ���ϵ��ַ�����0��ʼ -->h
        System.out.println(s2.concat("iamwho")); //�ַ���ƴ��  -->http://localhost/abc.txtiamwho
        System.out.println(s2.endsWith("ami"));//�Ƿ���ĳ���ַ���������true|false ---false
        System.out.println(s2.startsWith("who"));//�Ƿ���ĳ���ַ�����ʼ  --->false
        System.out.println(s2.indexOf(97));  //�����ֶ�Ӧ���ַ���������97(a)��λ��-->10
        System.out.println(s2.indexOf(97,2)); //�Ҵӵ�13���ַ���ʼ������λ��  -->10
                                                            //�Ҳ�������-1,ֻ�ǿ�ʼ��λ�ø�
                                                            //���ˣ�λ�ò���-->10

        System.out.println(s2.indexOf("a"));   //-->17
        System.out.println(s2.lastIndexOf("a")); //�ַ������һ�γ��ֵ�λ��,���ҵ���ʼ��-->17
        System.out.println(s2.lastIndexOf("a",11));  //��4��ʼ����һ�������ֵ�λ��-->10
        System.out.println(s2.lastIndexOf(97,15)); //-->10
        System.out.println(s2.lastIndexOf(".")); //-->20
        System.out.println(s2.substring(s2.lastIndexOf(".")+1)); //��ȡ.��������� -->txt
        System.out.println(s2.substring(0,4)); //http 0-4���������� -->http
        System.out.println("---------------------------------");
        System.out.println(s2.length());//��ȡ�ַ�������  -->24
        System.out.println(s1.isEmpty()); //�ж��ַ����Ƿ�Ϊ�մ�  -->true 
        System.out.println(s2.replace("txt","html")); //�滻�ַ���  -->http://localhost/abc.html
        String[] s4 = s2.split("t",2);  //limit�����и��ַ����ĸ��� -->h ���� tp://localhost/abc.txt
        for (String ss:s4
             ) {
            System.out.println(ss);
        }
        System.out.println("---------------------------------");
        System.out.println(s2.replaceFirst("t","s")); //hstp://localhost/abc.txt
        //��һ���ַ���ȥ���ָ���ַ�����ֻ�����һ���ַ�
        System.out.println(s2.replaceAll("t","a")); //haap://localhosa/abc.axa
        System.out.println(s2.toUpperCase());  //תΪ��д�ַ�  --> HTTP://LOCALHOST/ABC.TXT
        System.out.println(s3.trim()); //ȥ��ǰ��ո� -->ǰ���пո�
        System.out.println("--------------------------");
        System.out.println(sc);
        System.out.println(s);
        System.out.println(str);
        System.out.println("--------------------------");
        //equals����Ϊobject�ڵķ������Ƚ������������ͣ�string�����˷�����д,==�൱�ڹ�ϵ�����
        //�Ƚϻ����������͵�ֵʱ���ж�����ֵ�Ƿ����   ==������������ �жϵ��ǵ�ַ
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2));  //false
        System.out.println(s5.equals("abc"));  //�Ƚ������ַ���,����true|false
        System.out.println(s1.equalsIgnoreCase("ABC")); //���Դ�Сд�Ƚ��ַ���
        System.out.println("-----------s----b------r----------------");
        StringBuilder sbr = new StringBuilder(30);
        sbr.append("asdjkltws");
        sbr.replace(0,1,"!!!");  //!!!sdjkltws
        sbr.insert(0,"~~~");  //~~~!!!sdjkltws
        sbr.delete(0,3);            //!!!sdjkltws
        System.out.println(sbr);
        System.out.println(sbr.capacity());  //3o������������ָ������

        StringBuffer sbr1 = new StringBuffer();  //�÷�������StringBuilder��ͬ��
                                                //������ԭ���ַ����Ͻ����ַ�ƴ��
        sbr1.append("abcsjis");
    }
}
