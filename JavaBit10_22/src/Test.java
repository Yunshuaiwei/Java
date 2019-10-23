/**
 * @ProjectName JavaBit10_22
 * @ClassName Test
 * Description
 * @Auther YunSW
 * @Date 2019/10/22 17:44
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Student s=new Student("ysw",18,1001);
        s.student();
        Teacher t=new Teacher("wang",30,2001);
        t.teacher();
        //Person p3=new Person();抽象类不能实例对象
        Person p=new Student("ysw2",18,1001);//多态
        p.walk();
        p.eat();
        //初始化的是子类对象
        System.out.println(p.name+",,,,,"+p.age);
        Person p2=new Teacher();//多态
        p2.walk();
    }
}
//抽象类
abstract class Person{
    String name;
    int age;
    public abstract void eat();//抽象方法
    Person(){

    }
    Person(String n,int a){
        name=n;
        age=a;
    }
    public void game(){
        System.out.println("人玩游戏！");
    }
    public void person(){
        System.out.println("我叫"+name+"今年"+age+"岁！");
    }
    public void walk(){
        System.out.println("人走路！");
    }
}
class Student extends Person{
    int id;
    Student(String name,int age,int id){
        super(name,age);
        this.id=id;
    }
    Student(){

    }
    public void student(){
        System.out.println("我叫"+name+"今年"+age+"岁,学号为："+id+"!");
    }
    //对父类方法重写
    public void walk(){
        System.out.println("学生跑步！");
    }
    //实现父类的抽象方法
    public void eat(){
        System.out.println("学生吃饭！");
    }
}
class Teacher extends Person{
    int id;
    //实现父类抽象方法
    public void eat(){
        System.out.println("老师吃饭！");
    }
    Teacher(String name,int age,int id){
        super(name,age);
        this.id=id;
    }
    Teacher(){

    }
    public void teacher(){
        System.out.println("我的教工号为："+id+"我是"+name+"我今年"+age+"岁!");
    }
    //对父类方法重写
    public void walk(){
        System.out.println("老师锻炼身体！");
    }
}

