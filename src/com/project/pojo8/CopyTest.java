package com.project.pojo8;

import java.io.*;

public class CopyTest {
    public static void main(String[] args) {
        //文件复制
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\abb.txt");
        //目标位置
        File file1 = new File("C:\\Users\\gaoti\\Desktop\\test\\add\\"+file.getName());
        InputStream is = null;
        OutputStream os = null;
        try {
            //创建is os 流
            is = new FileInputStream(file);
            os = new FileOutputStream(file1);
            //创建接受byte数组
            byte[] bytes = new byte[(int)file.length()];
            //is写入bytes
            int result = is.read(bytes);
            System.out.println(result); //9 字节数组的长度
            //bytes写出到os
            os.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭输入输出流
                os.close();
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
