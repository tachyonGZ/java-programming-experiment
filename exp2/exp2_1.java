import java.util.Scanner;

public class exp2_1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int d = 0;
		switch (m){
			case 1:
				d = 31;
				break;
			case 2:
				d = 28;
				break;
			case 3:
				d = 31;
				break;
			case 4:
				d = 30;
				break;
			case 5:
				d = 31;
				break;
			case 6:
				d = 30;
				break;
			case 7:
				d = 31;
			case 8:
				d = 31;
				break;
			case 9:
				d = 30;
				break;
			case 10:
				d = 31;
				break;
			case 11:
				d = 30;
				break;
			case 12:
				d = 31;
				break;
			default:
				System.out.println("输入有误");
				return;
		}
		System.out.println(d);
	}
}