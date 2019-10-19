import java.util.Arrays;

/**
 * @ProjectName BitDay05
 * @ClassName Test10_19
 * Description
 * @Auther YunSW
 * @Date 2019/10/19 14:34
 * @Version 1.0
 **/
public class Test10_19 {
    public static void main(String[] args) {
        int []arr=new int[]{1,3,4,5,6,7,8,9};
        int []arr2=new int[]{1,2,3};
        int []arr3=new int[]{1,2,3};
        int []arr4=new int[5];
        int []arr5=new int[]{3,2,5,1,7,3,10};
        Arrays.fill(arr4,0,4,5);
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.equals(arr2,arr3));
        System.out.println(binarySearch(arr,7,0,arr.length-1));
    }
    //递归二分查找
    public static int binarySearch(int []arr,int key,int left,int right){
        int mid=(left+right)/2;
        if(left>right){
            return -1;
        }
        if(key<arr[mid]){
            return binarySearch(arr,key,left,right=mid-1);
        }else if(key>arr[mid]){
            return binarySearch(arr,key,left=mid+1,right);
        }else{
            return mid;
        }
    }
}
