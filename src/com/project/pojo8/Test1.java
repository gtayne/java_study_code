package com.project.pojo8;
import javax.print.DocFlavor;
import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\abb.txt");
        if(!file.exists()){
            try {
                file.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("文件已存在不可被创建");
            //System.out.println(file.getAbsoluteFile());
        }
        InputStream is = null;  //通道初始化
        try {
            //创建通道
            is = new FileInputStream(file);
            //创建容器byte数组进行数据接受，由于存储文件中的是字节，所以用字节存储效率较高
            byte[] bytes =new byte[(int)file.length()];
            //读取文件中的内容
            is.read(bytes);
            //byte数组打印
            System.out.println(new String(bytes));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭通道(要放在finally里面才能执行)
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
