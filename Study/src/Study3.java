
class Person{
	public int age;
	public String name;
	public String sex;
	public static int count;
	public final int SIZE =10;
	public static final int COUNT=99;
	public void eat() {
		int a=10;
		System.out.println("eat()!");
	}
	public void sleep() {
		System.out.println("sleep()!");
	}
	public static void staticTest() {
		System.out.println("staticTeat()");
	}
}

public class Study3 {
	public static void main(String[] args) {
		Person person=new Person();
		System.out.println(person.age);
		System.out.println(person.name);
		//静态变量只能通过类名去访问
		//System.out.println(person.count);
		System.out.println(Person.count);
		System.out.println(Person.COUNT);
		Person.staticTest();//所有被static所修饰的方法或属性，全部不依赖对象
		person.eat();
		person.sleep();
	}	

}
