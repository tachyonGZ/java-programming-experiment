import java.util.Scanner;

public class exp4_3{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String s2 = s1.replaceAll("[^0-9]", "");
		System.out.println(s2);
	}
}