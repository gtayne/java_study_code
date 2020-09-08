public class test05_ConditionalOperator {
    public static void main(String[] args){
        boolean flag = true; 
        int k = flag ? 1 : 0;
        System.out.println(k);  //结果为1

        flag = false;
        int x = flag ? 1 : 0;
        System.out.println(x); //结果为0

        boolean sex = true;
        String gender = sex ? "男" : "女";
        System.out.println(gender);

        int m = 100;
        int n = 100;
        System.out.println(m==n?"m和n相等":"m和n不相等");

    }
}