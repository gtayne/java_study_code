public class test08_dowhile {
    public static void main(String[] args){
        String password;
        String username;
        int i=0;
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        do{
            System.out.println("用户名");
            username = scanner.next();
            System.out.println("密码");
            password = scanner.next();
            ++i;
            System.out.println("输入了"+i+"次"+"您还有"+(3-i)+"次输入机会");
            if(i>2){
                System.out.println("输入次数过多");
                break;
            }
        }
        while(!username.equals("admin") || !password.equals("123"));{
            if(i>=2)
            System.out.println("退出系统");
            else if(i<2)
            System.out.println("登录成功，欢迎" + username + "回来！");
        }
            

    }
    
}
