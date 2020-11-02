package com.project;

public class student_Average{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setNo("1001");
        s1.setName("张三");
        int score1 = -90;
        s1.setScore(score1);
        /*s1.print();
        //查看某个属性的值
        s1.getName();
        s1.getNo();
        s1.getScore();
         */
        int[] arr = {};
        Student[] stus = new Student[10];
        for(int i=0;i<stus.length;i++){
            Student stu = new Student(); //Student类型的数组
            stu.setName("abc"+i);
            stu.setScore((i+1)*10);
            stu.setNo(100+"i");
            stus[i]=stu;  //将当前stu对象赋值给stus数组
        }
        int sum1=0;
        for(int j=0;j<stus.length;j++){
            sum1 += stus[j].getScore(); //数组get对象，数据返回时需要使用get方法
            /*上面这句相当于以下三句
            Student ss11 = stus[j]; //拿到对象
            int sc = ss1.getScore; //获取对象的值
            sum1+=sc;               //相加
             */
        }
        System.out.println(sum1/stus.length);
        System.out.println(s1); //默认调用tostring，不写tostring时，输出com.project.Student@34c45dca
                                // 包名.类名.8位16进制地址
        System.out.println(s1.toString());  //1001张三0
    }
}
