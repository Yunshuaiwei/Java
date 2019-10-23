package BitTask;

/**
 * @ProjectName Java10_23
 * @ClassName Task2
 * Description
 * @Auther YunSW
 * @Date 2019/10/23 18:42
 * @Version 1.0
 **/
public class Task2 {
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person("ysw");
        Person p3=new Person("yun",18,"男");
        p1.fun1();
        p1.fun2();
        System.out.println("--------------------");
        p2.fun1();
        p2.fun2();
        System.out.println("--------------------");
        p3.fun1();
        p3.fun2();
    }
}
class Person{
    String name;
    int age;
    String sex;
    Person(){

    }
    Person(String name){
        this.name=name;
    }
    Person(String name,int age,String sex){
        this(name);
        this.age=age;
        this.sex=sex;
    }
    public void fun1(){
        System.out.println("name: "+name);
    }
    public void fun2(){
        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
    }
}
