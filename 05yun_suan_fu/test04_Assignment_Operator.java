public class test04_Assignment_Operator {
   public static void main(String[] args){
       //赋值运算符
        int i = 10;
        System.out.println(i);
        i = i+1;
        System.out.println(i);
        int x = 10;
        x += 1;  //相当于x = x+1
        System.out.println("x=" + x);
        int y = 10;
        y -= 1;  //相当于 y = y-1
        System.out.println("y=" + y);
        int z = 10;
        z *= 2;  //相当于z = z*2
        System.out.println("z=" + z);
        int m = 10;
        m /= 3;
        System.out.println("m=" + m);
        int n = 10;
        n %= 3;
        System.out.println("n=" + n);
        
        byte b = 10;

        b += 1;  //相当于b = (byte)(b+1)
        System.out.println("b = "+b);  //b=11

        /*
        *java对于扩展类的赋值运算符进行了特殊的处理，
         * 所有的扩展赋值运算符，最终都不会改变运算的结果类 
         * 型，假设前面的变量是byte类型，那么后面的表达式运 
         * 算之后的结果还是byte类型。所以实际上b += 1等同于： 
         *  b = (byte)(b + 1); 这里要注意精度损失的问题
        */


        
   } 
}