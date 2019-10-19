import java.sql.SQLOutput;

/**
 * @ProjectName BitDay05
 * @ClassName Test
 * Description
 * @Auther YunSW
 * @Date 2019/10/16 18:41
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
//        int n=fun(7);
        int n1=1234;
        System.out.println("****************");
        print(n1);
        System.out.println("****************");
//        int n=1729;
//        System.out.println(Num(n));
        int n=7;
        int m=fun1(n);
        int f=fun2(n);
        System.out.println(m);
        System.out.println(f);
    }
    //斐波那契数递归
    public static int fun1(int n){
        if(n==1||n==2){
            return 1;
        }
        return fun1(n-1)+fun1(n-2);
    }
    //斐波那契数非递归
    public static int fun2(int n){
        int a=1;
        int b=1;
        int c=0;
        if(n==1||n==2){
            return 1;
        }
        for (int i = 3; i <=n ; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    //前n项和
    public static int fun(int n){
        if(n==1){
            return 1;
        }
        return n+fun(n-1);
    }
    //打印一个数的每一项
    public static int print(int n){
        if(n<9){
            return n%10;
        }
        int m=print(n/10);
        System.out.println(m);
        return n%10;
    }
//    public static int Num(int n){
//        if(n<10){
//            return n;
//        }
//        return n%10+Num(n/10);
//    }
}
