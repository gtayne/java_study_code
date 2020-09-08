public class test01_ArithmeticOperator {
    public static void main(String[] args){
        int a = 10;
        int b = 3;
        System.out.println(a/b);  //两个int型相除，结果还是int型
        System.out.println(a%b);   
        int i = 10;
        i++;
        System.out.println("i= "+i);
        int j = 10;
        ++j;
        System.out.println("j= "+j);
        int k = 10;
        int m = k++;   //先做赋值运算，再自加
        System.out.println("k = "+k);
        System.out.println("m = "+m);
        
        int x = 10;
        int y = ++x;  //当加号出现在变量前，会先进行自加操作，之后再做赋值运算
        System.out.println("x= "+x);
        System.out.println("y= "+y);

        int p = 100;
        System.out.println(p++);  //结果为100

        int q = 100;
        System.out.println(++q);  //结果为101


        
        
               
    }
}