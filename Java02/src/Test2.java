
import java.util.Random;
import java.util.Scanner;
public class Test2 {
	//��ʮ����
	public static void main(String [] args) {
		int num =0;
		Random rand=new Random();
		int flag=rand.nextInt(101);
		while(true) {
			System.out.println("���������֣�0����100����");
			Scanner in=new Scanner(System.in);
			num=in.nextInt();
			if(num>flag) {
				System.out.println("�´��ˣ�");
			}else if(num<flag) {
				System.out.println("��С�ˣ�");
			}else {
				System.out.println("�¶��ˣ�");
				break;
			}
		}
	}
	/*
	//��ʮ����
	public static void main(String [] args) {
		int num=10;
		for(int i=0;i<32;i++) {
			int tmp=0;
			tmp=((num>>i)&1);
			System.out.printf("%d ", tmp);
		}
	}
	
	//��ʮ����
	public static void main(String [] args) {
		int num=10;
		System.out.println("ż��λΪ��");
		for(int i=0;i<32;i+=2) {
			int tmp=0;
			tmp=((num>>i)&1);
			System.out.printf("%d ", tmp);
		}
		System.out.println();
		System.out.println("����λΪ��");
		for(int i=1;i<32;i+=2) {
			int tmp=0;
			tmp=((num>>i)&1);
			System.out.printf("%d ", tmp);
		}
	}
	
	//��ʮһ��
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
		System.out.println(num+"�Ķ�������1�ĸ���Ϊ��"+count);
	}
	
	//��ʮ��
	public static void main(String [] args) {
		String cipher="ysw123";
		int count=3;
		while(true) {
			System.out.println("����������"+"("+count+"�λ���"+")��");
			Scanner in=new Scanner(System.in);
			String pass=in.nextLine();
			Boolean result=pass.equals(cipher);
			if(result) {
				System.out.println("��¼�ɹ���");
				break;
			}
			else {
				System.out.println("�������");
				count--;
			}
			if(count==0) {
				System.out.println("�˳���");
				break;
			}
		}
	}
	
	//�ھ���
	public static void main(String [] args) {
		int a=0;
		int b=0;
		int c=0;
		System.out.println("0����999֮���ˮ�ɻ���Ϊ��");
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
	//�ڰ���
	public static void main(String [] args) {
		int count=0;
		for(int i=1;i<100;i++) {
			if(i%10==9||i/10==9) {
				count++;
			}
		}
		System.out.println("1����100��9�ĸ���Ϊ��"+count);
	}
	//������
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
