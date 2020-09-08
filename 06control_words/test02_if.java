public class test02_if {
    public static void main(String[] args){
        
        System.out.print("请输入数字");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int sex = scan.nextInt();
        if (sex == 1){
            System.out.println("为男性");
        }else if(sex == 0){
            System.out.println("为女性");
        }else{
            System.out.println("请输入正确的数字 0 or 1");
        }

    }    
}
