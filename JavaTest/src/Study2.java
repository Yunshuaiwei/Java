/*
* super 关键字
* */
class Animal1{
    String name="动物";
    void shout (){
        System.out.println("动物发出叫声！");
    }
}
class Dog2 extends Animal1{
    String name="犬类！";
    void shout(){
        super.shout();
    }
    void printName(){
        System.out.println("name="+super.name);
    }
}
public class Study2 {
    public static void main(String [] args){
        Dog2 dog2=new Dog2();
        dog2.shout();
        dog2.printName();
    }
}
