public class test05_ConditionalOperator {
    public static void main(String[] args){
        boolean flag = true; 
        int k = flag ? 1 : 0;
        System.out.println(k);  //���Ϊ1

        flag = false;
        int x = flag ? 1 : 0;
        System.out.println(x); //���Ϊ0

        boolean sex = true;
        String gender = sex ? "��" : "Ů";
        System.out.println(gender);

        int m = 100;
        int n = 100;
        System.out.println(m==n?"m��n���":"m��n�����");

    }
}