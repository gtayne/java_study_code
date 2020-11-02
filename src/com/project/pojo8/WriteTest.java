package com.project.pojo8;

import java.io.*;

public class WriteTest {
    public static void main(String[] args) {
        //文件写出的位置
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\abb.txt");
        OutputStream os = null;
        //创建通道
        try {
            //写出output
            os = new FileOutputStream(file,true);
            try {
                //write方法默认覆盖原来文件中的内容,如果不想覆盖在创建方法后面加true
                os.write("asdjijsai".getBytes());
                System.out.println("写出完毕");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
