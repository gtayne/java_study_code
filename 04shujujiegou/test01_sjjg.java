public class test01_sjjg{
    public static void main(String[] args){
        char c1 = '\u4e2d';  //转义为unicode码
        System.out.println("abc" + c1 + "def");
        int c = 1000;
        long d = c ;
        int f = 10 /3 ;
        long g = 10;
        /* int h = g / 3;  不兼容的类型: 从long转换到int可能会有损失*/
        long m = g /3 ;
        /* byte x = (byte)g/3;  从int转换到byte可能会有损失 */
        /* short i = 10; byte j = 5; short k = i + j; 不兼容的类型: 从int转换到short可能会有损失 */
        /* 	多种数据类型做混合运算时，最终的结果类型是最大容量对应的类型
            !char short byte 除外 */
        char cc = 'a';
        System.out.println("cc="+cc);
        int o = cc + 100; System.out.println(o);
        int i = 0xffff;
    }
}