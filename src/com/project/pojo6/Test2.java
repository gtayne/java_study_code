package com.project.pojo6;

public class Test2 {
    public static void main(String[] args) {
        People p1 = People.getInstance();
        People p2 = People.getInstance();
        People p3 = People.getInstance();
        //���ص�ǰ��Ķ��� ������һ�����ֻ��һ��ʵ��������
        /*1.˽�й��췽��
          2.�ṩstatic����getinstance���ṩ����
          3.����ȫ�ֵľ�̬����
          4.���жϣ��ٸ�ֵ
         */
        System.out.println(p1); //com.project.pojo6.People@7c30a502
        System.out.println(p2);  //com.project.pojo6.People@7c30a502
        System.out.println(p3);  //com.project.pojo6.People@7c30a502
    }
}
