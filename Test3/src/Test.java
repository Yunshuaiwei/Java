
class Student{
	 String name;
	 int grade=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	 
	
}
public class Test {
	public static void main(String [] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		stu1.setName("wang");
		stu1.setGrade(19);
		stu2.setName("Li");
		stu2.setGrade(20);
		System.out.println("����"+stu1.getName()+"������"+stu1.getGrade());
		System.out.println("����"+stu2.getName()+"������"+stu2.getGrade());
		
	}
}
