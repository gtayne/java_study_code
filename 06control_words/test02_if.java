public class test02_if {
    public static void main(String[] args){
        
        System.out.print("����������");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int sex = scan.nextInt();
        if (sex == 1){
            System.out.println("Ϊ����");
        }else if(sex == 0){
            System.out.println("ΪŮ��");
        }else{
            System.out.println("��������ȷ������ 0 or 1");
        }

    }    
}
