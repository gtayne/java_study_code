public class test08_dowhile {
    public static void main(String[] args){
        String password;
        String username;
        int i=0;
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        do{
            System.out.println("�û���");
            username = scanner.next();
            System.out.println("����");
            password = scanner.next();
            ++i;
            System.out.println("������"+i+"��"+"������"+(3-i)+"���������");
            if(i>2){
                System.out.println("�����������");
                break;
            }
        }
        while(!username.equals("admin") || !password.equals("123"));{
            if(i>=2)
            System.out.println("�˳�ϵͳ");
            else if(i<2)
            System.out.println("��¼�ɹ�����ӭ" + username + "������");
        }
            

    }
    
}
