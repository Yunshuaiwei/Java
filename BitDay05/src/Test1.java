/**
 * @ProjectName BitDay05
 * @ClassName Test1
 * Description
 * @Auther YunSW
 * @Date 2019/10/16 21:00
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fun(n));
    }
    //青蛙跳台阶
    public static int fun(int n){
        if (n == 1) {
            return 1;
        }
        if(n==2){
            return 2;
        }
        return fun(n-1)+fun(n-2);
    }
}
