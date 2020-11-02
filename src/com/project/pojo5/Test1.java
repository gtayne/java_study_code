package com.project.pojo5;

public class Test1 {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.setMainBoard("主板");
        c.setI(new I5());  //传参多态，父类引用子类接口
        Cpu cpu = c.getI(); // 赋值多态
        c.getI().jisuan();
    }
}
