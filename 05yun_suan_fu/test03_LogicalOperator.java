public class test03_LogicalOperator {
   public static void main(String[] args){
       System.out.println(5>3 & 5>4);
       System.out.println(3>5 & 5>4);  //False
       System.out.println(5>3 | 4>5);  //True
       System.out.println(3>5 | 5>4);  //True
       System.out.println(3>5 | 4>5);  //False
       System.out.println("--------------------------");
       System.out.println(true & true);
       System.out.println(true & false);
       System.out.println(!true);
       System.out.println(true | true);  //true
       System.out.println(true | false); //true
       System.out.println(false | false); //false
       System.out.println(true ^ false);  //true
       System.out.println(true ^ true);  //false
       System.out.println(false ^ false);  //false
       System.out.println("--------------------------");
       int x = 100;
       int y = 98;
       int z = 99;
       System.out.println(x > y & x > z);  //true
       System.out.println(x > y && x > z);  //true

       int m = 99;
       int n = 100;
       //System.out.println(m > n & m > n++);  //false
       //System.out.println("n = " + n);  //n=101

       System.out.println(m > n && m > n++);  //false 双与时表示短路，前面的
                                              //返回结果为false时则不执行后面
                                              //语句
       System.out.println("n = " + n);  //n=100

       System.out.println("--------短路与短路或------------------");
       int j = 90;
       int k = 100;
       int l = 110;
       System.out.println(j > k && k > j++); //false
       System.out.println(j); //90

       System.out.println(j < k || l < j++); //false
       System.out.println(j); //90

       System.out.println(j>k&k>l++);
       System.out.println(l); //111
       System.out.println(j&k);  //64
       System.out.println("-----------位运算符---------------");
       int a = 5;
       int b = 6;
       System.out.println(a&b); //4 0100
       System.out.println(a|b); //7 0111
       System.out.println(a^b); //3 0011
       int right = 15;
       int left = 15;
       System.out.println(right>>1); //7 1111→0111右移变为一半
       System.out.println(left<<1); //30 0000 1111→0001 1110左移变为二倍
       System.out.println(right<1); //7 1111→0111右移变为一半
   } 
}