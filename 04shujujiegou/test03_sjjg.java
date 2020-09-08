public class test03_sjjg {
   public  static void main(String[] args){
       char c1 = '找';
       System.out.println(c1);

       char c2 = '0';
       System.out.println(c2);
       
       byte byte1 = 124;
       System.out.println(byte1);

       int a = 10;
       long b = 10L;
       long c = 10;
      /* int d = c;   ///错误: 不兼容的类型: 从long转换到int可能会有损失 */
      int d = (int)c;   //强制类型转换可以由小容量赋值给大容量，但可能造成精度损失
                        //强制类型转换会砍掉前面四个字节的值
      long e = 2147483648L; 
      System.out.println(c);
      System.out.println(e);

      byte f = (byte)300;
      System.out.println(f);
   }
}