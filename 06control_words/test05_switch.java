public class test05_switch {
   public static void main(String[] args){
    while(true){
    java.util.Scanner scan = new java.util.Scanner(System.in);
    char a= 2;
    switch(a){
        case 1:
            System.out.println(1); 
            break;
        case 2:
            System.out.println(2); 
            break;
        case 3:
            System.out.println(3); 
            break;
        default:
            System.out.println("not match");
       }
   }
}
    
}
