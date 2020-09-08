public class test04 {
    public static void main(String[] args){
        System.out.println("-------intArr--------");
        int[] arr = {1,9,66,99,2};
        System.out.println(arr); //直接打印变量并不能把变量所代表的的数据打印
        System.out.println(arr[0]); // 1
        for(int j = 0;j<=arr.length-1;j++){
        System.out.println(arr[j]); // 1 
        }
        System.out.println("-------CharArr--------");
        char[] CharArr = {'\u0394','b','c','d'};
        for(int j = 0;j<=CharArr.length-1;j++){
        System.out.println(CharArr[j]); 
        }
        System.out.println("-------FloatArr--------");
        float[] FloatArr = {1.0f,2.0f,3.0f,4.0f};
        //FloatArr[4] = 1.5f; 数组一旦定义 长度不可修改
        FloatArr[1]=1.5f;
        for(int j = 0;j<=FloatArr.length-1;j++){
        System.out.println(FloatArr[j]);
        }
        System.out.println("-------LongArr--------");
        long[] LongArr = {1L,2L,3L,4L};
        for(int j = 0;j<=LongArr.length-1;j++){
        System.out.println(LongArr[j]); 
        }
        System.out.println("-------使用while遍历--------");
        int j =0;
        while(j <= CharArr.length-1){
            System.out.println(CharArr[j]);
            j ++;
        }
        System.out.println("-------new创建int类型数组--------");
        int[] ArrNew = new int[10]; 
        System.out.println(ArrNew[0]);
        
        System.out.println("-------new创建long类型数组--------");
        long[] LongArrNew = new long[10]; 
        System.out.println(LongArrNew[0]);
    
        System.out.println("-------new创建Short类型数组--------");
        short[] ShortArrNew = new short[10]; 
        System.out.println(ShortArrNew[0]);

        System.out.println("-------new创建byte类型数组--------");
        byte[] ByteArrNew = new byte[10]; 
        System.out.println(ByteArrNew[0]);

        System.out.println("-------new创建float类型数组--------");
        float[] FloatArrNew = new float[10]; 
        System.out.println(FloatArrNew[0]);
       
        System.out.println("-------new创建double类型数组--------");
        double[] DoubleArrNew = new double[10]; 
        System.out.println(DoubleArrNew[0]);

        System.out.println("-------new创建char类型数组--------");
        char[] CharNew = new char[10]; 
        System.out.println(CharNew[0]);
        System.out.println(CharNew[0]=='\u0000');

        System.out.println("-------new创建boolean类型数组--------");
        boolean[] BooleanNew = new boolean[10]; 
        System.out.println(BooleanNew[0]);
        
        int[] Arr_mix = new int[]{12,67,88};
    }
}

