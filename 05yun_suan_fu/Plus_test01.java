public class Plus_test01 {
   public static void main(String[] args){
       int a = 10;
       int b = 20;
       int c = a + b;
       System.out.println("a + b = "+c);
       System.out.println(a + "+" + b + "=" + a+b); //结果为10+20=1020
       System.out.println(a + "+" + b + "=" + (a+b)); //结果为10+20=30，这里的
       /*括号改变了运行顺序，正常应该为从左到右运行*/


       String name = "jack";
       System.out.println("登陆成功， 欢迎" + name + "回来!");
   } 
}
