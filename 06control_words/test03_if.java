public class test03_if {
    public static void main(String[] args){
        while(true){
        System.out.print("�����뿼�Գɼ�");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int score = scan.nextInt();
        if(score>=60&score<=70)
            System.out.print("�ɼ��ϸ�"+'\n');
        else if(score>=70&score<=90)
            System.out.print("�ɼ�����"+'\n');
        else if(score<60)
            System.out.print("�ɼ����ϸ�"+'\n');
        else if(score>=90&score<=100)
            System.out.print("�ɼ�����"+'\n');
        else
            System.out.print("��������ȷ�ĳɼ�");
        
    }  
}
}
