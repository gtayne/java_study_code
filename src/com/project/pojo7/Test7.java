package com.project.pojo7;

public class Test7 {
    public static void main(String[] args) {
        try {
            Employee c = new Employee("30", "null", 83);
            System.out.println(c);
        } catch (Exception e1){
            e1.printStackTrace();
        }

        try {
            Employee d = new Employee(600,1000);
            System.out.println(d.getTotalsalary());
            Employee e = new Employee(600,d);
            System.out.println(e.getTotalsalary());
        }catch (Exception e2){
            e2.printStackTrace();
        }
    }
}
