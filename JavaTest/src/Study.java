/*
静态方法
*/
//class Person{
//    public static void say(){
//        System.out.println("Hello!");
//    }
//}
/*
静态代码块
*/
class Person {
    static{
        System.out.println("执行了Person类中的代码块");
    }
}
public class Study {
    static{
        System.out.println("执行Study类中的代码块");
    }
    public static void main(String [] args){
//        Person.say();   //通过类名直接调用
//        Person person=new Person();//创建对象
//        person.say();//通过对象调用
         Person P1=new Person();
         Person P2=new Person();
    }
}
