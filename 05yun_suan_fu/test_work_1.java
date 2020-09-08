public class test_work {
    public static void main(String[] args){
        /**
         * 第一：两个int类型数据进行数学运算之后的结果一定是int类型；
         * 第二：++或--可以出现在变量前也可以是变量后；
         * 第三：++无论出现在变量前还是变量后，只要执行了++，那么变量必然会自加1；
         * 第四：++出现在变量后会先进行赋值运算，再自加1；
         * 第五：++出现在变量前会先自加1，再进行赋值运算
         */
        int x = 10;
        int a = x + x++;
        System.out.println(a);  //20
        System.out.println(x);  //11 
        int b = x+x++;
        System.out.println(x);  //12 
        System.out.println(b);  //22 
        int c = x + x--;
        System.out.println(x);  //11
        System.out.println(c);  //24 (减号出现在x后，先进行赋值运算，再加一12 + 12)
        int d = x + --x;
        System.out.println(d);  //21 (减号出现在x前，先减一，再赋值)
        System.out.println(x);  //10
        
    }
}
