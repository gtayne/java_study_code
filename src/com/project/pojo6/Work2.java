package com.project.pojo6;

public class Work2 {
    public static void main(String[] args) {
        String str = "abcdefg2345$";
        char[]  chars =  str.toCharArray();  //字符串转换成字符数组
        int a = 0;
        int b = 0;
        int o = 0;
        for (char c:chars
             ) {
            if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
                a++;
            }else if(c>='0'&&c<='9') {
                b++;
            }else {
                o++;
            }
        }
        System.out.println("apla:"+a);
        System.out.println("num:"+b);
        System.out.println("others:"+o);

        String str2 = "TeneT";
        String result="";
        for (int j = str2.length()-1; j >=0 ; j--) {
            result+=str2.charAt(j);
        }
        System.out.println(result);
        String s3 = "aaabbaabaaabb";
        String[] strs = s3.split("[b]+"); //通过任意多个字符进行分割，
        int sum=0;
        for (String s:strs
             ) {
            int count=0;
            if(s.length()!=0){
                for (int j = 0; j < s.length(); j++) {
                    count+=j+1;
                }
                sum+=count;
            }
        }
        System.out.println(sum);

        String s5 = "to be or not to be";
        String[] strs2=s5.split(" ");
        String result2 = " ";
        for (String s :strs2) {
            for(int k=s.length()-1;k>=0;k--){
                result2=result2+s.charAt(k);
            }
            result2+=" ";
        }
        System.out.println(result2.trim());
        System.out.println("-------------------------------------------");
        //字符串转置
        StringBuilder sbr = new StringBuilder("to be or not to be");
        String s = new String(sbr.reverse());
      //  System.out.println(s); // eb ot ton ro eb ot
        String[] strs4 = s.split(" ");
        StringBuilder result3 = new StringBuilder();
        for(int i=strs4.length-1;i>=0;i--){
            result3.append(strs4[i]);
            result3.append(" ");
        }
        System.out.println(result3);
//        sbr.reverse();  //eb ot ton ro eb ot
//        StringBuilder result3 = new StringBuilder();
//        for(int i=sbr.length()-1;i>=0;i--){
//            result3.append(sbr.charAt(i));
//        }
//        System.out.println(result3);
    }
}
