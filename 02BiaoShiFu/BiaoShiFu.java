/*
    标识符：自己有权利命名的单词为标识符 
        包括 类名 方法名 变量名 接口名 常量名...
    标识符的命名规则：
        1.标识符只能由数字，字母，下划线，$组成 且不能以
        数字开头,标识符中不能有空格
        2.关键字不能做标识符(public main void等)
        3.标识符严格区分大小写,如果一个源文件中同时出现了A类和a类，谁在前生成
        谁有效public和PUBLIC不一样
        4.长度无限制
    标识符的命名规范：
        1.见名知义
        2.驼峰命名方式
        3.类名，接口名首字母大写，后面单词首字母大写UserTest
        3.变量名，方法名首字母小写，后面每个单词首字母大写userTest
        4.常量名，全部大写，单词之间用_分割USER_TEST
    关键字（具有特殊含义的单词）：
        1.单词全部小写
        
*/
public class BiaoShiFu{               //类名
   public static void main(String[] args){

           int  Year = 22;
   } 

   public static void demoTest(){  //demo为方法名
           int kingYear = 100;            //k 变量
        }
   public static void test_demo2(){
           System.out.println("Year");
   }
}