public class inttest01_sjjg {
   public static void main(String[] args){
        long a = 10L;
        char c = 'a';
        short s = 100;
        int i = 30;
        System.out.println(a + c + s + i);  // 237
        /*多种数据类型做混合运算时，最终的结果类型是最大容量对应的类型
        char short byte 除外
        char short byte 混合运算时，会各自先转换成int再做运算
        */
        int x = (int)(a + c + s + i);   //计算后为long类型
                                 //从long转换到int可能会有损失

        /* java 中规定，int类型和int类型运算最终的结果还是int类型。*/
        int temp = 10 / 3;   //结果为三
        System.out.println(temp);

        int temp2 = 1 / 2;
        System.out.println(temp2);  //结果为0
   } 
}