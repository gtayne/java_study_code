/*变量：在内存当中存储数据的最基本单元
三要素：数据类型 名字 保存的值
变量必须先声明，在使用"="赋值才能访问，等号右边先执行，再赋值给左面的变量
命名规范：首字母小写，后面首字母大写 
   数据类型：不同的数据类型在内存中分配的空间大小不同
   整数型int JVM会自动给int分配4个字节大小的空间 1字节=8bit int占用32个二进制位

   带小数  double

*/
public class identifer {
   public static void main(String[] args){
       int a = 2147483647;
       int nianLing = 46;
       System.out.println(nianLing);
       nianLing = 48;
       System.out.println(nianLing);
   } 
}
