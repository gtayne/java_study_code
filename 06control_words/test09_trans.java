public class test09_trans {
   public static void main(String[] args){
       int sum=0;
       java.util.Scanner scanner=new java.util.Scanner(System.in);
       while (true){
           System.out.println("����������:");
           int num=scanner.nextInt();
           if (num>0&num<100){
               sum += num;
               System.out.println("�����������Ϊ"+num+"��ǰ�ۼӽ��Ϊ"+sum);
           }else{
               System.out.println("���������������");
               break;
           }
       }
       System.out.println("���յ��ۼӽ��Ϊ"+sum);
   } 
}
