class Person2{
	private String name;
	private int age;
	private String sex;
	public Person2() {
		this.name="caocao";
		this.age=10;
		this.sex="ÄÐ";
	}
	public Person2(String name,int age,String sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public void show() {
		System.out.println("name:"+name+"  age:"+age+"  sex:"+sex);
	}
}
public class Study5 {
	public static void main(String[] args) {
		Person2 p1=new Person2();
		p1.show();
		Person2 p2=new Person2("zhang",80,"ÄÐ");
		p2.show();
	}
}
