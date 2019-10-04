interface Shape{
	double area(double a);
}
class Square implements Shape{
	public double area(double a) {
		return a*a;
	}
}
class Circle implements Shape{
	public double area(double a) {
		return 3.14*a*a;
	}
}
public class Test {
	public static void main(String [] args) {
		Square S=new Square();
		Circle C=new Circle();
		double b=S.area(3);
		System.out.println(b);
		double c=C.area(4);
		System.out.println(c);
	}
}
