import java.util.Scanner;

class Fibna{
	public int Fun(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1||n==2) {
			return 1;
		}
		return Fun(n-1)+Fun(n-2);
	}
}
public class Fibnaci {
	public static void main(String [] args) {
		System.out.println("��Ҫ��ڼ���쳲���������");
		int n=0;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		Fibna Fibna1=new Fibna();
		int c=Fibna1.Fun(n);
		System.out.println("��"+n+"��쳲�������Ϊ��"+c);
	}
}
