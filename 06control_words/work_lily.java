public class work_lily {
    public static void main(String[] args){
   /*for(int i=100;i<=999;i++){
       int ge = i%10;
       int bai = i/100;
       int shi = i%100/10;
       if(ge*ge*ge+bai*bai*bai+shi*shi*shi==i){
           System.out.println(i+"��ˮ�ɻ���");
       }
    */
    /*
    System.out.println("---------------------");
    int num=0;
    for(int bai=1;bai<=4;bai++){
        for(int shi=1;shi<=4;shi++){
            for(int ge=1;ge<=4;ge++){
                if(ge !=shi && shi!=bai && bai!=ge){
                    System.out.println((bai*100+shi*10+ge)+"��Ҫ������");
                    num++;
                }
            }    
        }
    }
    System.out.println("һ����"+num+"�����ַ�������");
    */
    /*while(true){
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("����Ҫ����Ľ׳�����:");
    int n = scan.nextInt();
    long result = 1;
    for(int i = 1;i<=n;i++){
        result*=i;
    }
    System.out.println(n+"�Ľ׳�Ϊ"+(result));
    } 
    */
    for(int i=1;i<=1000;i++){
        int sum=0;
        for(int n=1;n<i-1;n++){
            
            if(i%n==0){
                //System.out.println(n+"��"+i+"������");
                sum+=n;
            }
        }
        if(sum==i){
            System.out.println(i);
        }
    }  
} 
   }

