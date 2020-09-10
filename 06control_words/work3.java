public class work3 {
    public static void test1(int a){
        for(int i=1;i<=a;i++){             //循环打印a行
            for(int k=1;k<=a-i;k++){       //打印空格
                    System.out.print(" ");
            }    
                for(int j=1;j<=2*i-1;j++){  //打印*
                    System.out.print("*");
                }
                System.out.print("\n");  //结束一行后面换行
        }
        
}

    public static void test2(int start,int end){
        int sum=0;
        for(int a=start;a<=end;a++){
            if((a%4==0&&a%10!=0)||(a%400==0)){ //闰年
                sum+=366;    
            }else{
                sum+=365;
            }
        }
        System.out.println(sum);
    }
    public static void test3(int head,int legs){
        for(int i=0;i<=(legs/2);i++){  //假设鸡的数量，循环
            for(int j=0;j<=(legs/4);j++){  //假设兔子的数量，循环
                if((i+j==head)&&(i*2+j*4==legs)){  //满足一共有35头，鸡和兔加一起94只脚
                    System.out.println("一共有"+i+"只鸡"+j+"只兔子");
                }
            }
        }
    }
    public static void binary(int[] arr,int num){
        int start=0;
        int end=(arr.length-1);
        System.out.println(start+" "+end);
        while(start<=end){
            int middle = (start+end+1)/2;
        System.out.println(middle);
            if(arr[middle]==num){
                System.out.println(num);
                break;
            }else if(arr[middle]>num){
                end = middle-1;
            }else if(arr[middle]<num){
                start = middle+1;
            }
        }
    }
    public static void main(String args[]){
        //test1(12);
        //test2(1998,2020);
        //test3(60,200);
        int[] arr = new int[100];
        binary(arr, 90);
    }

    }
    

