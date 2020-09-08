public class test09_trans {
   public static void main(String[] args){
       int sum=0;
       java.util.Scanner scanner=new java.util.Scanner(System.in);
       while (true){
           System.out.println("请输入数字:");
           int num=scanner.nextInt();
           if (num>0&num<100){
               sum += num;
               System.out.println("您输入的数字为"+num+"当前累加结果为"+sum);
           }else{
               System.out.println("您输入的数字有误");
               break;
           }
       }
       System.out.println("最终的累加结果为"+sum);
   } 
}
