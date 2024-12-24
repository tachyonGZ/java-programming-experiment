import java.util.Scanner;

public class exp4_2{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		char first = s.charAt(0);
		char last = s.charAt(s.length() - 1);
		System.out.println("frist:" + first);
		System.out.println("last:" + last);
	}
}