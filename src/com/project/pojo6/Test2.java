package com.project.pojo6;

public class Test2 {
    public static void main(String[] args) {
        People p1 = People.getInstance();
        People p2 = People.getInstance();
        People p3 = People.getInstance();
        //返回当前类的对象 单例：一个类就只有一个实例（对象）
        /*1.私有构造方法
          2.提供static方法getinstance，提供对象
          3.创建全局的静态对象
          4.先判断，再赋值
         */
        System.out.println(p1); //com.project.pojo6.People@7c30a502
        System.out.println(p2);  //com.project.pojo6.People@7c30a502
        System.out.println(p3);  //com.project.pojo6.People@7c30a502
    }
}
