import java.util.Scanner;

public class exp2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(foo(n));
	}

	public static int foo(int n){
		if (n == 0) return 0;
		return n * n + foo(n - 1);
	}
}