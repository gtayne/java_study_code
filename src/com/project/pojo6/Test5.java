package com.project.pojo6;
import java.io.File;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) {
        int a = 1; //��ʱ�洢��������ʱ��������ص��ڴ���
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\abb");
        //�����ļ��ķ�ʽ
            //boolean b1 =  file.exists();  //�ж��ļ��Ƿ����true
            //System.out.println(b1);
            if (!file.exists()) {
                try {
                    file.mkdir();
                    file.createNewFile();  //�����ļ��ɹ���񷵻ز���ֵ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
             else{
                System.out.println("�ļ��Ѵ��ڲ��ɴ���");
             }
}
}
