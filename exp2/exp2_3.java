import java.util.Scanner;

public class exp2_3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int[] n = new int[10];
		for (int i = 0; i < 10; i++){
			n[i] = s.nextInt();
		}
		
		int max = n[0], min = n[0];
		for (int i = 1; i < 10; i++){
			if (n[i] > max) max = n[i];
			if (n[i] < min) min = n[i];
		}

		System.out.printf("max:%d min:%d", max, min);
	}
}