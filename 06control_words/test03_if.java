public class test03_if {
    public static void main(String[] args){
        while(true){
        System.out.print("请输入考试成绩");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int score = scan.nextInt();
        if(score>=60&score<=70)
            System.out.print("成绩合格"+'\n');
        else if(score>=70&score<=90)
            System.out.print("成绩良好"+'\n');
        else if(score<60)
            System.out.print("成绩不合格"+'\n');
        else if(score>=90&score<=100)
            System.out.print("成绩优秀"+'\n');
        else
            System.out.print("请输入正确的成绩");
        
    }  
}
}
