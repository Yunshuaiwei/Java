class Animal{
    public Animal(String name){
        System.out.println("你是一只"+name);
    }
}
class Dog extends Animal{
    public Dog(){
        super("拉布拉多");
    }
}
public class Study {
    public static void main(String [] args){
        Dog dog=new Dog();
    }
}