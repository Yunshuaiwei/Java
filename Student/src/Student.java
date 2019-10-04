class Student1{
	String name;
	int age=0;
	public void Init(String name,int age) {
		this.name=name;
		this.age=age;
	}
	void Print() {
		System.out.println("姓名是："+name+"年龄为："+age);
	}
}
class Undergraduate extends Student1{
	String degree;
	void Init2(String name, int age,String degree) {
		this.name=name;
		this.age=age;
		this.degree=degree;
	}
	void Show() {
		System.out.println(name+" "+age+" "+degree);
	}
}
public class Student {
	public static void main(String [] args) {
		Student1 Stu=new Student1();
		Undergraduate Under=new Undergraduate();
		Stu.Init("yun",15);
		Stu.Print();
		Under.Init2("cao", 18, "学士");
		Under.Show();
	}
}
