import java.util.Arrays;

/**
 * @ProjectName BitDay05
 * @ClassName Test2
 * Description
 * @Auther YunSW
 * @Date 2019/10/19 9:03
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) {
        int []array1={1,2,3};
        int []array2=new int[]{1,2,3,4,5};
        int[] array3=new int[3];
        for (int x:array2) {
            System.out.print(x+"    ");
        }
        System.out.println();
        for (int x:array3) {
            System.out.print(x+"    ");
        }
        System.out.println();
        System.out.println(array1[2]);
        System.out.println("**********************");
        int [] arr=new int[]{1,2,3};
        fun(arr);
        for (int x:arr) {
            System.out.print(x+"    ");
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.println("**********************");
        System.out.println(toString(arr));
        System.out.println("**********************");
        int []arr1=new int[]{1,2,3,4,5};
        int []arr2=Arrays.copyOf(arr1,arr1.length);
        System.out.println(Arrays.toString(arr2));
        System.out.println("**********************");
        int []arr3=new int[]{2,4,1,3,8,5,6};
        System.out.println(max(arr3));
        System.out.println("**********************");
        System.out.println(min(arr3));
        System.out.println("**********************");
        System.out.println(avg(arr3));
        System.out.println("**********************");
        System.out.print(Arrays.toString(reverse(arr3)));
        System.out.println();
        System.out.println("**********************");
        System.out.print(Arrays.toString(func(arr3)));
    }
    public static int [] fun(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]*=2;
        }
        return arr;
    }
    public static int [] fun2(int arr[]){
        int [] tmp=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            tmp[i]=arr[i]*2;
        }
        return tmp;
    }
    public static String toString(int [] arr){
        String str="[";
        for (int i = 0; i <arr.length ; i++) {
            str+=arr[i];
            if(i<arr.length-1){
                str+=",";
            }
        }
        str+="]";
        return str;
    }
  /*  public static int[]copyArray(int [] ori,int newlength){

    }*/
    public static int max(int []arr){
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int []arr){
        int min=arr[0];
        for (int x:arr) {
            if(x<min){
                min=x;
            }
        }
        return min;
    }
    public static int avg(int []arr){
        int sum=0;
        for (int x:arr) {
            sum+=x;
        }
        return sum/arr.length;
    }
    public static int [] reverse(int []arr){
        int tmp=0;
        for (int i = 0; i <arr.length ; i++) {
            if(i<=arr.length-i) {
                tmp=arr[i];
                arr[i] = arr[arr.length -1-i];
                arr[arr.length -1-i]=tmp;
            }
        }
        return arr;
    }
    public static int[] func(int []arr){
        int tmp=0;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(arr[left]%2!=0){
                left++;
            }
            while(arr[right]%2==0){
                right--;
            }
            if(left<right){
                tmp=arr[left];
                arr[left]=arr[right];
                arr[right]=tmp;
            }
            left++;
            right--;
        }
        return arr;
    }
}
