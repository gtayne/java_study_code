package com.project.pojo3;

public class test5 {
    public static void test(Person types) {
        System.out.println(types.getName());
    }

    public static Object getObj(int a){  //不确定返回类型时，可以用父类类型接收子类对象
        if(a==1){
            return new Man();
        }else if(a==2){
            return new Student();
        }else if(a==3){
            return new Woman();
        }else{
            return "返回类型为字符串";
        }
    }

//    public static void test(Woman woman) {
//        System.out.println(woman.getName());
//    }
//
//    public static void test(Student student) {
//        System.out.println(student.getName());
//    }

    public static void main(String[] args) {
//      Person p1 = new Person();
//      System.out.println(p1);

        /*强制类型转换*/
       Man man1 =  (Man)getObj(1);
       Student stu1 = (Student)getObj(2);
       Woman woman1= (Woman)getObj(3);
       System.out.println(getObj(4));


//        Man man = new Man();
//        test(man);
//        System.out.println(man);
//
//        Woman woman = new Woman();
//        test(woman);
//        System.out.println(woman);
//
//        Student s = new Student();
//        test(s);
//        System.out.println(s);
        /*识别实际类型(子类) 执行实际类型的方法*/
        Person p = new Woman();
        p.run();
        p.eat();

        Person p1 = new Man();
        p1.eat();
        p1.run();

        Person p2 = new Student();
        p2.eat();
        p2.run();

    }
}
