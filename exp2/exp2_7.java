import java.util.Scanner;

public class exp2_7100{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		double y;
		if (x <= 90){
			y = 0.6 * x;
		}
		else if (x <= 150){
			y = 54 + (x - 90) * 1.1;
		}else{
			y = 120 + (x - 150) * 1.7;
		}
		System.out.printf("%f", y);
	}
}