/**
 * @ProjectName JavaBit10_22
 * @ClassName Test02
 * Description
 * @Auther YunSW
 * @Date 2019/10/22 18:30
 * @Version 1.0
 **/
public class Test02 {
    public static void main(String[] args) {
        String name;

    }
}
class Person1{
    private String name;
    private int age;
    Person1(){

    }
    Person1(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
