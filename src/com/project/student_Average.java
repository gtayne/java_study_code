package com.project;

public class student_Average{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setNo("1001");
        s1.setName("����");
        int score1 = -90;
        s1.setScore(score1);
        /*s1.print();
        //�鿴ĳ�����Ե�ֵ
        s1.getName();
        s1.getNo();
        s1.getScore();
         */
        int[] arr = {};
        Student[] stus = new Student[10];
        for(int i=0;i<stus.length;i++){
            Student stu = new Student(); //Student���͵�����
            stu.setName("abc"+i);
            stu.setScore((i+1)*10);
            stu.setNo(100+"i");
            stus[i]=stu;  //����ǰstu����ֵ��stus����
        }
        int sum1=0;
        for(int j=0;j<stus.length;j++){
            sum1 += stus[j].getScore(); //����get�������ݷ���ʱ��Ҫʹ��get����
            /*��������൱����������
            Student ss11 = stus[j]; //�õ�����
            int sc = ss1.getScore; //��ȡ�����ֵ
            sum1+=sc;               //���
             */
        }
        System.out.println(sum1/stus.length);
        System.out.println(s1); //Ĭ�ϵ���tostring����дtostringʱ�����com.project.Student@34c45dca
                                // ����.����.8λ16���Ƶ�ַ
        System.out.println(s1.toString());  //1001����0
    }
}
