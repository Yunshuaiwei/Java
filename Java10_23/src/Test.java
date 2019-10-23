import java.util.Scanner;

/**
 * @ProjectName Java10_23
 * @ClassName Test
 * Description
 * @Auther YunSW
 * @Date 2019/10/23 16:19
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        boolean isflag = true;
        while (isflag) {
            System.out.println("请输入你要进行的运算：1.加法；2.减法；3.乘法；4.除法；0.退出");
            Scanner in = new Scanner(System.in);
            int flag = in.nextInt();
            Function f = new Function();
            if (flag == 1) {
                System.out.println("请输入两个数：");
                Calculator c = new Calculator();
                c.setNum1(in.nextDouble());
                c.setNum2(in.nextDouble());
                System.out.println(c.getNum1()+"+"+c.getNum2()+"="+f.func1(c));
            }
            if (flag == 2) {
                System.out.println("请输入两个数：");
                Calculator c = new Calculator();
                c.setNum1(in.nextDouble());
                c.setNum2(in.nextDouble());
                System.out.println(c.getNum1()+"-"+c.getNum2()+"="+f.func2(c));
            }
            if (flag == 3) {
                System.out.println("请输入两个数：");
                Calculator c = new Calculator();
                c.setNum1(in.nextDouble());
                c.setNum2(in.nextDouble());
                System.out.println(c.getNum1()+"x"+c.getNum2()+"="+f.func3(c));
            }
            if (flag == 4) {
                System.out.println("请输入两个数：");
                Calculator c = new Calculator();
                c.setNum1(in.nextDouble());
                c.setNum2(in.nextDouble());
                System.out.println(c.getNum1()+"/"+c.getNum2()+"="+f.func4(c));
            }
            if(flag==0){
                isflag=false;
            }
        }
    }
}
