/*
* 类的继承
* */
//class Animal{
//    String name;
//    void shout() {
//        System.out.println("动物发出叫声！");
//    }
//}
//class Dog extends Animal{
//    public void printname(){
//        System.out.println("name="+name);
//    }
//}
//public class Study1 {
//    public static void main(String [] args){
//        Dog dog=new Dog();
//        dog.name="拉布拉多";
//        dog.printname();
//        dog.shout();
//    }
//}
/*
* 对类的重写
* */
class Animal{
    String name;
    public void shout(){
        System.out.println("动物发出叫声！");
    }
}
class Dog extends Animal{
    public void shout(){
        System.out.println("旺旺旺、、、");
    }
    public void printname(){
        System.out.println("name="+name);
    }
}
public class Study1 {
    public static void main(String [] args){
        Dog dog=new Dog();
        dog.name="拉布拉多";
        dog.shout();
        dog.printname();
    }
}