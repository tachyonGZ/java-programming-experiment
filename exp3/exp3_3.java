import java.util.Scanner;

public class exp3_3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		InterfaceA ia = new ClassB();
		System.out.println(ia.method(s.nextInt()));
	}
}

public class ClassB implements InterfaceA{
	public int method(int n){
		int sum = 1;
		for (int i = n; i > 0; i--){
			sum *= i;
		}
		return sum;
	}
}

public interface InterfaceA{
	public int method(int n);
}