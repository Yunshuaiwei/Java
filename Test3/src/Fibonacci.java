import java.util.Scanner;
class Fib{
	public int Fun(int n) {
		int a=1;
		int b=1;
		int c=1;
		if(n==0) {
			return 0;
		}
		if(n==1||n==2) {
			return 1;
		}
		for(int i=4;i<=n;i++) {
			a=b;
			b=c;
			c=a+b;
		}
		return c;
	}
}
public class Fibonacci {
	public static void main(String [] args) {
		System.out.println("��Ҫ��ڼ���쳲���������");
		int n=0;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		Fib Fib1=new Fib();
		int c=Fib1.Fun(n);
		System.out.println("��"+n+"��쳲�������Ϊ��"+c);
	}
}
