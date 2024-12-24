import java.util.Scanner;

public class exp3_2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		InterfaceA ia = new ClassA();
		System.out.println(ia.method(s.nextInt()));
	}
}

public class ClassA implements InterfaceA{
	public int method(int n){
		int sum = 0;
		for (int i = n; i > 0; i--){
			sum += i;
		}
		return sum;
	}
}

public interface InterfaceA{
	public int method(int n);
}