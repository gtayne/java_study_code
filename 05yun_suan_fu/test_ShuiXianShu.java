public class test_ShuiXianShu{
    public static void main(String[] args){
        int a = 145;
        int bai = a / 100; 
        int shi = a % 100/10;
        int ge = a % 10;
        System.out.println(bai);
        System.out.println(shi);
        System.out.println(ge);
        if (bai*bai*bai+shi*shi*shi+ge*ge*ge==a){
            System.out.println(a+"��ˮ�ɻ���");
        }
        else{
            System.out.println(a+"����ˮ�ɻ���");
        }
    }
}