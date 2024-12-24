import java.util.Scanner;

public class exp4_11{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();
		int pt = scanner.nextInt();
		String number = 
			y + "0" + pt + String.format("%03d", (int)(Math.random() * 900) + 100);
		System.out.println(number);
	}
}