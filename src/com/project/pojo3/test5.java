package com.project.pojo3;

public class test5 {
    public static void test(Person types) {
        System.out.println(types.getName());
    }

    public static Object getObj(int a){  //��ȷ����������ʱ�������ø������ͽ����������
        if(a==1){
            return new Man();
        }else if(a==2){
            return new Student();
        }else if(a==3){
            return new Woman();
        }else{
            return "��������Ϊ�ַ���";
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

        /*ǿ������ת��*/
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
        /*ʶ��ʵ������(����) ִ��ʵ�����͵ķ���*/
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
