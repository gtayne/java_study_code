public class test_work_2 {
   public static void main(String[] args){
       int a = 15;
       int b = 2;
       double c = 2;
       /*不同的类型做运算时，先将各自先转换成容量最大的类型，再进行运算。 */
       System.out.println(a+"/"+b+"="+(a/b));           //7
       System.out.println(a + "%" + b + "=" + (a % b)); //1
       System.out.println(a + "/" + c + "=" + (a / c)); //7.5
       System.out.println(a + "%" + c + "=" + (a % c)); //1.0
   } 
}
