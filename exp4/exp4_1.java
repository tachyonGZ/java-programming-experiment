import java.util.Scanner;

public class exp4_1{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		String s3 = s1.concat(s2).toUpperCase();
		System.out.println(s3);
	}
}