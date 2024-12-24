import java.util.Scanner;

public class exp3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c;
		while (a % b != 0)
		{
			c = a;
			a = b;
			b = c - b;
		}
		System.out.println(b);
	}
}