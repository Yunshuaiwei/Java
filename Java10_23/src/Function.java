/**
 * @ProjectName Java10_23
 * @ClassName Function
 * Description
 * @Auther YunSW
 * @Date 2019/10/23 18:15
 * @Version 1.0
 **/
public class Function {
    public double func1(Calculator c){
        return c.getNum1()+c.getNum2();
    }
    public double func2(Calculator c){
        return c.getNum1()-c.getNum2();
    }
    public double func3(Calculator c){
        return c.getNum1()*c.getNum2();
    }
    public double func4(Calculator c){
        return c.getNum1()/c.getNum2();
    }
}
