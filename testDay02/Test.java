package testDay02;
/*
 *        ���������أ�overload��
 *  1.ͬһ��������������������
 *    1.1 ͬһ���࣬ͬһ����������������ͬ
 *  2.�ж��Ƿ�������
 *    2.1 ���������η��� ����ֵ���͡��������޹�         
 *  3.ͨ��������÷���ʱ�����ȷ��ĳһ��ָ������
 *    3.1 ������-->�����б�
 *        �ɱ�������β�
 *  1.����ʹ��
 *    1.1 �ɱ�����βθ�ʽ���������͡�����������
 *    1.2 �����ÿɱ�����ķ���ʱ�����Դ�0����1���������ɱ��������
 *    1.3 �ɱ���������ķ����뱾���з�������ͬ���ββ�ͬ�ķ���֮����Թ������ء�
 *    1.4 �ɱ���������ķ����뱾���з�������ͬ���β�����Ҳ��ͬ������֮�䲻�ܹ������ء������߲��ܹ��档
 *    1.5 �ɱ�����β��ڷ������β��У�ֻ��������ĩβ��
 *        public void show(String...strs,int i){
 *        }//�ᱨ������
 *        public void show(int i��String...strs){
 *        }//��ȷд����
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
	public void show(String...s) //s���൱��һ������
	{
		System.out.println("...");
	}
	//1. ����
	public void mOL(int i) {
		System.out.println(i*i);
	}
	public void mOL(int i,int j) {
		System.out.println(i*j);
	}
	public void mOL(String s) {
		System.out.println(s);
	}
	//2.����
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
