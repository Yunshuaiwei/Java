/*
 * 静态变量对所有类共享，不属于对象，访问方法为     类名.属性
 * */

class TestMeno{
	public int a;
	public static int count;
}                              
public class Study2 {
	public static void main(String [] args) {
		TestMeno t1=new TestMeno();
		t1.a++;
		TestMeno.count++;
		System.out.println(t1.a);
		System.out.println(TestMeno.count);
		System.out.println("===========");
		TestMeno t2=new TestMeno();
		t2.a++;
		TestMeno.count++;
		System.out.println(t2.a);
		System.out.println(TestMeno.count);
	}
}
