import java.util.*;
class Num{
	public int Show(int num) {
		int number=0,d5,d4,d3,d2,d1;
		if(num>0&&num<99999) {
			d5=num/10000;
			d4=num/1000%10;
			d3=num/100%10;
			d2=num/10%10;
			d1=num%10;
			if(d5!=0) {
				System.out.println(num+"��5λ����");
				if(d5==d1&&d4==d2) {
					System.out.println(num+"�ǻ�������");
				}
				else {
					System.out.println(num+"���ǻ�������");
				}
			}
			else if(d4!=0) {
				System.out.println(num+"����λ����");
				if(d4==d1&&d3==d2) {
					System.out.println(num+"�ǻ�������");
				}
				else {
					System.out.println(num+"���ǻ�������");
				}
			}	
			else if(d3!=0) {
				System.out.println(num+"����λ����");
				if(d3==d1) {
					System.out.println(num+"�ǻ�������");
				}
				else {
					System.out.println(num+"���ǻ�������");
				}
			}
			else if(d2!=0) {
				System.out.println(num+"����λ����");
				if(d2==d1) {
					System.out.println(num+"�ǻ�������");
				}
				else {
					System.out.println(num+"���ǻ�������");
				}
			}
			else if (d1!=0) {
				System.out.println(num+"�ǻ�������");
			}
			
		}
		else {
			System.out.println("�������");
		}
		return 0;
	}
}
public class Number {
	public static void main(String [] args) {
		int num=0;
		System.out.println("������0--99999֮������֣�");
		Scanner in=new Scanner(System.in); 
		num=in.nextInt();
		Num Num1=new Num();
		Num1.Show(num);
	}
}
