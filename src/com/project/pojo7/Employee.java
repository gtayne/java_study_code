package com.project.pojo7;
public class Employee {
    private String no;
    private String name;
    private int age=0;
    private int salary;
    private String idcard;
    private int number;
    private double totalsalary;

    public Employee(String no, String name, int age)throws NullException,AgeHeightException,AgeLowerException {
        if(age<18){
            throw new AgeLowerException();
        }else if(age>60){
            throw new AgeHeightException();
        }
        if(name==null||name.equals("")){
            throw  new NullException();
        }

        this.no = no;
        this.name = name;
        this.age = age;
    }

    public Employee(int salary, int number) throws SalaryLowerExceprion,SalaryHeightException,SalaryNullException{
        this.totalsalary += salary;

        if(salary==0){
         throw new SalaryNullException();
        }else if(salary<600){
            throw new SalaryLowerExceprion();
        }else if(salary>totalsalary){
         throw new SalaryHeightException();
     }
        this.salary = salary;
        this.number = number;
    }

    public Employee(int salary,Employee employee) {
        this.totalsalary = salary+employee.getSalary();  //每次调用该构造方法,totalSalary相加
    }

    public double getTotalsalary() {
        return totalsalary;
    }

    public int getSalary() {
        return salary;
    }
}
