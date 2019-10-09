
public class Test1 {
	public static void main(String [] args) {
		int a=20;
		int b=16;
		int c=0;
		int tmp=0;
		int tmp2=0;
		for(;a>=1;a--) {
			c=a;
			if(20%c==0) {
				tmp=c;
			}
			for(;b>=1;b--) {
				c=b;
				if(16%c==0) {
					tmp2=c;
				}
				if(tmp==tmp2) {
					System.out.println(tmp2);
					break;
				}
			}
		}
		
	}
	/*public static void main(String [] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%d*%d=%.2d"+" ",j,i,j*i);
			}
			System.out.println();
		}
	}
	public static void main(String [] args) {
		int year=0;
		for(year=1000;year<=2000;year++) {
			if(year%100!=0&&year%4==0||year%400==0) {
				System.out.println(year+"是闰年!");
			}
		}
	}
	
	public static void main(String [] args) {
		int num=0;
		int tmp=0;
		for(num=1;num<=100;num++) {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					tmp++;
					break;
				}
				tmp=0;
			}
			if(tmp==0) {
				System.out.println(num);
				tmp=0;
			}
			
		}
	}
	public static void main(String [] args) {
		int num=5;
		int b=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				b++;
			}
		}
		if(b==0){
			System.out.println(num+"是素数！");
		}else{
			System.out.println(num+"不是素数！");
		}	
	}
	
	public static void main(String [] args) {
		int age=21;
		if(age<=18) {
			System.out.println("少年！");
		}else if(age>=19&&age<=28) {
			System.out.println("青年！");
		}else if(age>=29&&age<=55) {
			System.out.println("中年！");
		}else {
			System.out.println("老年！");
		}
	}
	public static void main(String [] args) {
		int a=10;
		int b=15;
		int c=20;
		int max=0;
		int min=0;
		if(a>b&&a>c) {
			max=a;
			if(b>c) {
				min=c;
			}
			min=b;
		}else if(b>a&&b>c) {
			max=b;
			if(a>c) {
				min=c;
			}
			min=a;
		}else {
			max=c;
			if(a>b) {
				min=b;
			}
			min=a;
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}
	public static void main(String [] args) {
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	*/
}
