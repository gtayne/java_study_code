package com.project.pojo5;

public class Test1 {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.setMainBoard("����");
        c.setI(new I5());  //���ζ�̬��������������ӿ�
        Cpu cpu = c.getI(); // ��ֵ��̬
        c.getI().jisuan();
    }
}
