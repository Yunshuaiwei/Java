package testDay02;
/*
 *        方法的重载（overload）
 *  1.同一个类中允许有重名方法
 *    1.1 同一个类，同一个方法名，参数不同
 *  2.判断是否是重载
 *    2.1 跟方法修饰符、 返回值类型、参数名无关         
 *  3.通过对象调用方法时，如何确定某一个指定方法
 *    3.1 方法名-->参数列表
 *        可变个数的形参
 *  1.具体使用
 *    1.1 可变个数形参格式：数据类型。。。变量名
 *    1.2 当调用可变参数的方法时，可以传0个、1个、、、可变个参数。
 *    1.3 可变个数参数的方法与本类中方法名相同，形参不同的方法之间可以构成重载。
 *    1.4 可变个数参数的方法与本类中方法名相同，形参类型也相同的数组之间不能构成重载。即二者不能共存。
 *    1.5 可变个数形参在方法的形参中，只能声明在末尾。
 *        public void show(String...strs,int i){
 *        }//会报错。。。
 *        public void show(int i，String...strs){
 *        }//正确写法。
 *    
 */
public class Test {
	public static void main(String [] args) {
		Test test=new Test();
		test.mOL(3);
		test.mOL("Hello");
		test.show("hello");
		test.show("hello","world");
		test.show();
	}
	public void show(String...s) //s就相当于一个数组
	{
		System.out.println("...");
	}
	//1. 重载
	public void mOL(int i) {
		System.out.println(i*i);
	}
	public void mOL(int i,int j) {
		System.out.println(i*j);
	}
	public void mOL(String s) {
		System.out.println(s);
	}
	//2.重载
	public int max(int i,int j) {
		return (i>j)?i:j;
	}
	public double max(double d1,double d2) {
		return (d1>d2)?d1:d2;
	}
	public double max(double d1,double d2,double d3) {
		double max=(d1>d2)?d1:d2;
		return (max>d3)?max:d3;
	}
}
