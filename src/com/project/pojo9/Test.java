package com.project.pojo9;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\add\\abb.txt");
        InputStream is = null;
        try {
            //文件读取时文件内容比较大，byte数组长度不能获取（最大为2G）
            //容器创建时以k为单位进行文件存储
            is = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int result1 = is.read(bytes);
            System.out.println(result1);
            System.out.println(new String(bytes));
            int result2 = is.read(bytes);
            System.out.println(result2);
            System.out.println(new String(bytes));
            int result3 = is.read(bytes);
            System.out.println(result3);
            System.out.println(new String(bytes));
            int result4 = is.read(bytes);
            System.out.println(result4);
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
