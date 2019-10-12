package testDay02;
/*
 *     面向对象的特征一：封装与隐藏
 * 1. 问题的引入：
 *    1.1当我们创建一个类的对象后，我们可以通过“对象.属性”的方法，对对象的属性进行赋值。
 *                     赋值操作受到数据类型和存储范围的制约。初次之外，没有其他限制条件。但事，在实际的问题中，我们
 *                     往往需要给属性赋值加入额外的限制条件。这个条件不能在属性声明时体现。我们只能通过方法进行条件
 *                     的添加 ，我们需要避免用户使用“对象. 属性”的方式对属性进行赋值。则需要将属性声明为私有（private）。    
 * 		 -->此时将体现类的封装性。
 * 2. 封装性的体现：
 *    2.1 我们将类的属性私有化（private），同时提供公共（public）方法的来获取（get）和设置（set）
 *    2.2 将方法私有化(不对外暴露私有方法)
 *    ......
 * 3. 封装性的体现
 *    3.1 Java中的4种权限（从小到大）：private、缺省、protected、public
 *    3.2 可以修饰类及类内部的结构：属性、方法、构造器、内部类
 *    3.3 具体的权限都可以用来修饰类的内部结构。
 *    3.4 修饰类只能是缺省或public。
 */
public class Test2 {
	public static void main(String [] args) {
		Animal a=new Animal();
		a.name="小狗";
		a.age=2;
//		a.legs=4;//不能直接调用
		a.setLegs(4);
		a.show();
	}
}
class Animal{
	
	String name;
	int age;
	private int legs;//腿的个数
	
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
			legs=0;//抛出异常
		}
	}
	public int getLegs() {
		return legs;
	}//获取属性
	
	
	public void eat() {
		System.out.println("动物进食！");
	}
	public void show() {
		System.out.println("name="+name+" ,age="+age+" ,legs="+legs);
	}
}