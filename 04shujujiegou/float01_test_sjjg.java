/*
float 4byte
double 8byte
容量上float 比 double 要大！
double 更精确
java.math.Bigdecimal 引用数据类型，更精确
float 和 double 存储数据时都存储的为近似值（内存有限）
java 中规定，任何一个浮点型数据默认被当成double 来处理,如果想要浮点型字面量当做
float来处理，那么在字面量后面加F/f 例如 1.0F 
*/
public class float01_test_sjjg {
    public static void main(String[] args){
        float a = 10;
        float b = 3;
        double c = (double)(a/b);
        System.out.println(c);

        double pi = 3.1415926;
        System.out.println(pi);

        /*错误: 不兼容的类型: 从double转换到float可能会有损失 
        float f  = 3.14;
        */
        float f1 = 3.14f;
        float f2 = (float)3.14;
    }   

}