/*
 * ��̬�����������๲�������ڶ��󣬷��ʷ���Ϊ     ����.����
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
