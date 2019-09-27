
class Person1{
	private String name;
	private int age;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void show() {
		System.out.println("name:"+name+"   age:"+age);
	}
}

public class Study4 {
	
	public static void main(String[] args) {
		Person1 person=new Person1();
		person.setName("caocao");
		person.setAge(89);
		String name=person.getName();
		int age=person.getAge();
		System.out.println(age);
		System.out.println(name);
		person.show();
	}
}
