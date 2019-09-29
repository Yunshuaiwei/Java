import java.util.*;

class Guess{
	public int Number1(int num) {
		Random random=new Random();
		int realNumber=random.nextInt(50)+1;
		int yourGuess=0;
		Scanner in=new Scanner(System.in);
		while(num!=realNumber) {
			if(num<realNumber) {
				System.out.println("你猜小了！");
				System.out.println("请重新输入：");
				num=in.nextInt();
			}
			else if(num>realNumber) {
				System.out.println("你猜大了！");
				System.out.println("请重新输入：");
				num=in.nextInt();
			}
		}
		System.out.println("你猜对了！");
		return 0;
	}
}
public class GuessNumber {
	public static void main(String [] args) {
		System.out.println("请输入数字：");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		Guess Gu=new Guess();
		Gu.Number1(num);
	}
}
