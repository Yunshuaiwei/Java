package testDay02;
/*
 *        ���������Ĵ���
 *  1. ���ڱ����ĸ�ֵ
 *     1.1 ��������ǻ����������ͣ���ʱ��ֵ���Ǳ��������������ֵ��
 *     1.2 ��������������������ͣ���ʱ��ֵ����������ĵ�ַ��
 *        �����βεĴ��ݻ���
 *  1. �βΣ���������ʱ��������С�����еĲ�����
 *  2. ʵ�Σ���������ʱ��ʵ�ʴ��ݸ��βε����ݡ�
 *  
 *  
 *  3. ���ݻ���
 *     3.1 ��������ǻ����������ʹ�ʱʵ�θ����βε���ʵ����ʵ������ֵ�� 
 *     3.2 �����������ʹ��ݵ��ǵ�ַ
 * 
 */
public class Test1 {
	public static void main(String [] args) {
		Test1 test=new Test1();
		int m=10;
		int n=20;
		test.swap(m,n);
		System.out.println("m="+m+",n="+n);
//		System.out.println("*******������������************");
//		int m=10;
//		int n=m;
//		System.out.println("m="+m+", n="+n);
//		n=20;
//		System.out.println("m="+m+", n="+n);
//		System.out.println("*******������������************");
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
