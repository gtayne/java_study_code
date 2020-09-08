public class testc {
    public static void main(String[] args){
        int a = 12321;
        int w = a/10000;
        System.out.println(w);
        int k = a%10000/1000;
        System.out.println(k);
        int bai = a %1000/100;
        System.out.println(bai);
        int shi = a%100/10;
        System.out.println(shi);
        int ge = a%10;
        System.out.println(ge);
        System.out.println(w==ge);
        System.out.println(k==shi);
        if (w==ge|k==shi){
            System.out.println("是回文数");
        }
    }
}
