public class demo {
    public static void myself(int[] arr){
                for(int i=0;i<arr.length-1;i++){
                        for(int j=0;j<arr.length-1-i;j++){
                                if(arr[j]>arr[j+1]){
                                        int temp=arr[j];
                                        arr[j]=arr[j+1];
                                        arr[j+1]=temp;
                                }
                        }
        }
        for(int a:arr){
                        System.out.println(a);
                }

    }
    public static void main(String[] args){
        int[] arr1 = {93,12,66,7,88,1};
        myself(arr1);
        int[] arr2 = {78,45,89,4,78,12};
        myself(arr2);
        }
}

