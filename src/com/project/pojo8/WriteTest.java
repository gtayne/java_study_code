package com.project.pojo8;

import java.io.*;

public class WriteTest {
    public static void main(String[] args) {
        //�ļ�д����λ��
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\abb.txt");
        OutputStream os = null;
        //����ͨ��
        try {
            //д��output
            os = new FileOutputStream(file,true);
            try {
                //write����Ĭ�ϸ���ԭ���ļ��е�����,������븲���ڴ������������true
                os.write("asdjijsai".getBytes());
                System.out.println("д�����");
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
