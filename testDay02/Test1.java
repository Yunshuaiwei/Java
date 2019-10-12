package testDay02;
/*
 *        方法参数的传递
 *  1. 关于变量的赋值
 *     1.1 如果变量是基本数据类型，此时赋值的是变量所保存的数据值。
 *     1.2 如果变量是引用数据类型，此时赋值的是所保存的地址。
 *        方法形参的传递机制
 *  1. 形参：方法定义时，声明的小括号中的参数。
 *  2. 实参：方法调用时，实际传递给形参的数据。
 *  
 *  
 *  3. 传递机制
 *     3.1 如果参数是基本数据类型此时实参赋给形参的是实参真实的数据值。 
 *     3.2 引用数据类型传递的是地址
 * 
 */
public class Test1 {
	public static void main(String [] args) {
		Test1 test=new Test1();
		int m=10;
		int n=20;
		test.swap(m,n);
		System.out.println("m="+m+",n="+n);
//		System.out.println("*******基本数据类型************");
//		int m=10;
//		int n=m;
//		System.out.println("m="+m+", n="+n);
//		n=20;
//		System.out.println("m="+m+", n="+n);
//		System.out.println("*******引用数据类型************");
	}
	public void swap(int m, int n) {
		int tmp=m;
		m=n;
		n=tmp;
//		m=m^n;
//		n=m^n;
//		m=m^n;
		System.out.println("m="+m+",n="+n);
	}
}
