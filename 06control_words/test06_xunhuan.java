public class test06_xunhuan {
   public static void main(String[] args){
      for(int row=1;row<10;row++){
          for(int col=1;col<=row;col++){
              int result = row*col;
              System.out.print(row+"*"+col+"="+result+" ");
          }
       System.out.print('\n');
      }
}
}
