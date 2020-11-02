package com.project.pojo3;

public class Test6 {

        public static void print(Shape shape){
            shape.MianJi();
            shape.ZhouChang();
        }
        public static Shape getShape(int a){  //向上转型
            if(a==1){
                return new Rectangle(90,10);
            }else{
                return new Circle(20);
            }
        }
        public static void main(String[] args) {
        print(new Rectangle(10,5));
        print(new Circle(20));
        Rectangle r = (Rectangle)getShape(1);  //向下转型
        Circle c = (Circle)getShape(2);
         }

    }
