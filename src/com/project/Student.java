package com.project;
public class Student {
    //˽���������������Լ�����ʹ�ã����˸���Ͳ���ʹ���ˣ��ڱ�����о�.������)
    //private ����Ȩ�����η� ˽�е�������������
    //publiac �����ģ��ڵ�ǰ��Ŀ�¹��������ݶ����Ա�����
    private String no;
    private String name;
    private int  score;

    public void setScore(int score1){
        if(score1>0) {
            score = score1;
        }else{
            score=0;
        }
    }
    public void setName(String name1){
        name=name1;
    }
    public void setNo(String no1){
        no=no1;
    }
    public void print() {
        System.out.println("------------------");
        System.out.println("ѧ����ѧ����" + no);
        System.out.println("ѧ����������" + name);
        System.out.println("ѧ���ĳɼ���" + score);
    }
    public String toString(){  //����ı�����ӡʱ��Ĭ�ϵ���toString
        return no+name+score;
    }

    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public String getNo(){
        return no;
    }
}

