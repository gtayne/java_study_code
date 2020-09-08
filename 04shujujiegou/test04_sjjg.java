public class test04_sjjg {
   public static void main(String[] args){
     byte a = (byte)300;
     System.out.println(a);  //结果为44 由大容量int转换为小容量byte损失了精度
     char b = 49;            //结果为1 
    
     char zf_A = 97;
     System.out.println(zf_A);  //结果为a，这里自动由int类型转换为了char类型
     System.out.println(b);

     byte c = (byte)150;
     System.out.println(c);
    } 
}