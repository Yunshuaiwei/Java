package BitTask;

/**
 * @ProjectName Java10_23
 * @ClassName Task3
 * Description
 * @Auther YunSW
 * @Date 2019/10/23 18:54
 * @Version 1.0
 **/
public class Task3 {
    public static void main(String[] args) {
        Swap s=new Swap(1,2);
        System.out.println("num1= "+s.num1+"  num2= "+s.num2);
        swap(s);
        System.out.println("num1= "+s.num1+"  num2= "+s.num2);
    }
    public static void swap(Swap s){
        int tmp=0;
        tmp=s.num1;
        s.num1=s.num2;
        s.num2=tmp;
    }
}
class Swap{
    int num1;
    int num2;
    Swap(){

    }
    Swap(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
}
