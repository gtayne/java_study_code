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
            System.out.println("�ļ��Ѵ��ڲ��ɱ�����");
            //System.out.println(file.getAbsoluteFile());
        }
        InputStream is = null;  //ͨ����ʼ��
        try {
            //����ͨ��
            is = new FileInputStream(file);
            //��������byte����������ݽ��ܣ����ڴ洢�ļ��е����ֽڣ��������ֽڴ洢Ч�ʽϸ�
            byte[] bytes =new byte[(int)file.length()];
            //��ȡ�ļ��е�����
            is.read(bytes);
            //byte�����ӡ
            System.out.println(new String(bytes));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //�ر�ͨ��(Ҫ����finally�������ִ��)
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
