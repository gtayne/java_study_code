public class test06_sjjg {
    public static void main(String[] args){
        char c1 = 'a';
        byte b = 1;
        System.out.println(b + c1);
        // short s = c1 + b; 
        //这里编译器不知道加法的结果是多少，只知道结果是int
        // short s = (short)c1 + b; 虽然这里加入了强制类型转换，但编译器还
        //是将结果自动认为是int，产生报错信息：
        //错误: 不兼容的类型: 从int转换到short可能会有损失
        short s = (short)(c1 + b); //先计算，加括号就会有运算符优先级
                                   //之后int转换为short
        System.out.println(s);  //结果为98 正常
        int d = 30;
        short x = d;
        System.out.println(x);  //结果为30
        
    }
}