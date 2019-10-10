
import java.util.Random;
import java.util.Scanner;
public class Test2 {
	//第十四题
	public static void main(String [] args) {
		int num =0;
		Random rand=new Random();
		int flag=rand.nextInt(101);
		while(true) {
			System.out.println("请输入数字（0——100）：");
			Scanner in=new Scanner(System.in);
			num=in.nextInt();
			if(num>flag) {
				System.out.println("猜大了！");
			}else if(num<flag) {
				System.out.println("猜小了！");
			}else {
				System.out.println("猜对了！");
				break;
			}
		}
	}
	/*
	//第十三题
	public static void main(String [] args) {
		int num=10;
		for(int i=0;i<32;i++) {
			int tmp=0;
			tmp=((num>>i)&1);
			System.out.printf("%d ", tmp);
		}
	}
	
	//第十二题
	public static void main(String [] args) {
		int num=10;
		System.out.println("偶数位为：");
		for(int i=0;i<32;i+=2) {
			int tmp=0;
			tmp=((num>>i)&1);
			System.out.printf("%d ", tmp);
		}
		System.out.println();
		System.out.println("奇数位为：");
		for(int i=1;i<32;i+=2) {
			int tmp=0;
			tmp=((num>>i)&1);
			System.out.printf("%d ", tmp);
		}
	}
	
	//第十一题
	static int Num(int num) {
		int count=0;
		for(int i=0;i<32;i++) {
			if (((num >> i) & 1) == 1) {
				count++;
			}
		}	
		return count;
	}
	public static void main(String [] args) {
		int num=224;
		int count=Num(num);
		System.out.println(num+"的二进制中1的个数为："+count);
	}
	
	//第十题
	public static void main(String [] args) {
		String cipher="ysw123";
		int count=3;
		while(true) {
			System.out.println("请输入密码"+"("+count+"次机会"+")：");
			Scanner in=new Scanner(System.in);
			String pass=in.nextLine();
			Boolean result=pass.equals(cipher);
			if(result) {
				System.out.println("登录成功！");
				break;
			}
			else {
				System.out.println("密码错误！");
				count--;
			}
			if(count==0) {
				System.out.println("退出！");
				break;
			}
		}
	}
	
	//第九题
	public static void main(String [] args) {
		int a=0;
		int b=0;
		int c=0;
		System.out.println("0——999之间的水仙花数为：");
		for(int i=0;i<1000;i++) {
			a=i%10;
			b=i/10%10;
			c=i/100;
			if(c!=0&&i==(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3))) {
				System.out.println(i);
			}else if(b!=0&&i==(Math.pow(b, 2)+Math.pow(a, 2))) {
				System.out.println(i);
			}
		}
	}
	//第八题
	public static void main(String [] args) {
		int count=0;
		for(int i=1;i<100;i++) {
			if(i%10==9||i/10==9) {
				count++;
			}
		}
		System.out.println("1——100中9的个数为："+count);
	}
	//第七题
	public static void main(String [] args) {
		double a=1;
		double b=1;
		double tmp=0;
		double tmp1=0;
		double tmp2=0;
		for(a=1;a<=100;a+=2) {
			tmp1+=1/a;
		}
		for(a=2;a<=99;a+=2) {
			tmp2+=1/a;
		}
		tmp=tmp1-tmp2;
		System.out.printf("%.3f",tmp);
		
	}
	*/
}
