/**
 * @ProjectName BitDay05
 * @ClassName HomeWork
 * Description
 * @Auther YunSW
 * @Date 2019/10/17 16:36
 * @Version 1.0
 **/
public class HomeWork {
    public static void main(String[] args) {
        System.out.println("******第一题*******");
        System.out.println(multiply(5));
        System.out.println("******第二题*******");
        System.out.println(sum(5));
        System.out.println("******第三题*******");
        System.out.println(print(1234));
        System.out.println("******第四题*******");
        System.out.println(fibonacci(5));
        System.out.println("****第四题非递归****");
        System.out.println(fibonacci2(5));
        System.out.println("******第五题*******");
        hanoiTower(1,'A','B','C');
        System.out.println();
        System.out.println("*******************");
        hanoiTower(3,'A','B','C');
        System.out.println();
        System.out.println("******第六题*******");
        System.out.println(forgDrop(4));
    }
    //n的阶乘
    public static int multiply(int n){
        if(n==1){
            return 1;
        }
        return n*multiply(n-1);
    }
    //1+...+n
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    //打印数字每一位
    public static int print(int n){
        if(n<9){
            return n;
        }
        System.out.println(n%10);
        return print(n/10);
    }
    //斐波那契数1、1、2、3、5、8、13、21、……
    public static int fibonacci(int n){
        if(n==1||n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    //斐波那契  非递归
    public static int fibonacci2(int n){
        int a=1;
        int b=1;
        int c=1;
        if(n==1||n==2){
            return 1;
        }
        for (int i = 3; i <=n; i++) {
            a=b;
            b=c;
            c=a+b;
        }
        return c;
    }
    public static void move(char pos1,char pos2){
        System.out.printf("%c-->%c\t",pos1,pos2);
    }
    public static int hanoiTower(int n,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos3);
        }else{
            hanoiTower(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoiTower(n-1,pos2,pos1,pos3);
        }
        return 0;
    }
    //青蛙跳台阶
    public static int forgDrop(int n){
        if (n == 1) {
            return 1;
        }
        if(n==2){
            return 2;
        }
        return forgDrop(n-1)+forgDrop(n-2);
    }
}
