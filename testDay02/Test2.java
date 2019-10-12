package testDay02;
/*
 *     ������������һ����װ������
 * 1. ��������룺
 *    1.1�����Ǵ���һ����Ķ�������ǿ���ͨ��������.���ԡ��ķ������Զ�������Խ��и�ֵ��
 *                     ��ֵ�����ܵ��������ͺʹ洢��Χ����Լ������֮�⣬û�������������������£���ʵ�ʵ������У�����
 *                     ������Ҫ�����Ը�ֵ���������������������������������������ʱ���֡�����ֻ��ͨ��������������
 *                     ����� ��������Ҫ�����û�ʹ�á�����. ���ԡ��ķ�ʽ�����Խ��и�ֵ������Ҫ����������Ϊ˽�У�private����    
 * 		 -->��ʱ��������ķ�װ�ԡ�
 * 2. ��װ�Ե����֣�
 *    2.1 ���ǽ��������˽�л���private����ͬʱ�ṩ������public������������ȡ��get�������ã�set��
 *    2.2 ������˽�л�(�����Ⱪ¶˽�з���)
 *    ......
 * 3. ��װ�Ե�����
 *    3.1 Java�е�4��Ȩ�ޣ���С���󣩣�private��ȱʡ��protected��public
 *    3.2 ���������༰���ڲ��Ľṹ�����ԡ����������������ڲ���
 *    3.3 �����Ȩ�޶�����������������ڲ��ṹ��
 *    3.4 ������ֻ����ȱʡ��public��
 */
public class Test2 {
	public static void main(String [] args) {
		Animal a=new Animal();
		a.name="С��";
		a.age=2;
//		a.legs=4;//����ֱ�ӵ���
		a.setLegs(4);
		a.show();
	}
}
class Animal{
	
	String name;
	int age;
	private int legs;//�ȵĸ���
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setLegs(int l) {
		if(l>=0&&l%2==0) {
			legs=l;
		}else {
			legs=0;//�׳��쳣
		}
	}
	public int getLegs() {
		return legs;
	}//��ȡ����
	
	
	public void eat() {
		System.out.println("�����ʳ��");
	}
	public void show() {
		System.out.println("name="+name+" ,age="+age+" ,legs="+legs);
	}
}