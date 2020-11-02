package com.project.pojo6;
import java.io.File;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) {
        int a = 1; //临时存储，在运行时，程序加载到内存中
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\abb");
        //创建文件的方式
            //boolean b1 =  file.exists();  //判断文件是否存在true
            //System.out.println(b1);
            if (!file.exists()) {
                try {
                    file.mkdir();
                    file.createNewFile();  //创建文件成功与否返回布尔值
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
             else{
                System.out.println("文件已存在不可创建");
             }
}
}
