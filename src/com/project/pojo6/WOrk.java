package com.project.pojo6;

import org.w3c.dom.ls.LSOutput;

import java.io.OutputStream;

public class WOrk {
    public static void main(String[] args) {
        String s1 = "abc123...";
        int alpha = 0;
        int number = 0;
        int other = 0;
        for (int i = 0; i <s1.length() ; i++) {
            char c = s1.charAt(i);
            if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
                alpha++;
            }else if(c>='0'&&c<='9'){
                number++;
            }else{
                other++;
            }
        }
        System.out.println("数组s1的总长度为"+s1.length());
        System.out.println("数组s1含有数字"+number+"个");
        System.out.println("数组s1含有字母"+alpha+"个");
        System.out.println("数组s1含有其他字符"+other+"个");

        String s2 = "test";
        System.out.println(s2.replace("es","se"));
        String s3 = "jdk";
        String s3_upper = s3.toUpperCase();
        System.out.println(s3_upper+s3_upper.substring(s3_upper.indexOf("J")+1));
        String s4 = "aaabbaabaaabb";
        int[] sc4 = new int[s4.length()+1];
        int n = 0;
        for (int i = 0; i < s4.length(); i++) {
                sc4[i] = s4.charAt((int)i);
                if(sc4[i]==97){
                    sc4[i]=n+1;
                    n++;
                }else{
                    sc4[i]=0;
                    n=0;
                }
        }
        int h = sc4.length-1;
        int result = 0;
        while (h>=0){
            result+=sc4[h];
            h--;
        }
        System.out.println(result);
        System.out.println("----------------------------");
        String s5 = "to Be or not to Be";
        String blank = "";
        for (int i = s5.length()-1; i >= 0; i--) {
            blank+=s5.charAt(i);
        }
        System.out.println(blank);
    }


}
