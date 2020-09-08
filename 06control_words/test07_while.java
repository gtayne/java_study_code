public class test07_while {
   public static void main(String[] args){
        int i=1;
        int sum=0;   
        while(i<=100){
            if(i%2==0){
                sum += i ;
            }else{
                System.out.println(i+"²»ÊÇÅ¼Êý");
            }
            i++;
        }
        System.out.println(sum);
   } 
}
