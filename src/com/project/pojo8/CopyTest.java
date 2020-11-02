package com.project.pojo8;

import java.io.*;

public class CopyTest {
    public static void main(String[] args) {
        //�ļ�����
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\abb.txt");
        //Ŀ��λ��
        File file1 = new File("C:\\Users\\gaoti\\Desktop\\test\\add\\"+file.getName());
        InputStream is = null;
        OutputStream os = null;
        try {
            //����is os ��
            is = new FileInputStream(file);
            os = new FileOutputStream(file1);
            //��������byte����
            byte[] bytes = new byte[(int)file.length()];
            //isд��bytes
            int result = is.read(bytes);
            System.out.println(result); //9 �ֽ�����ĳ���
            //bytesд����os
            os.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //�ر����������
                os.close();
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
