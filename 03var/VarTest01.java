/**
 * 变量测试类
 * @author gaotianyu
 * @version 1.0
 * @since 1.0
 */

 /* 
在java语言中数据被称为字面量
    
    整数型字面量 1 2 -1 
    浮点型字面量 1.1 2.2 -2.2
    布尔值字面量 true false
    字符型字面量 'a' 'b' '中'
    字符串型字面量 "a" "abc" "中"

*/
public class VarTest01 {
    public static void main(String[] args){
        int a = 1; 
        System.out.println(100);
        System.out.println(true);
        System.out.println('a');
        //System.out.println('abc'); .\VarTest01.java:15: 错误: 未结束的字符文字
        System.out.println("abc");
        System.out.println(a);
    }

}