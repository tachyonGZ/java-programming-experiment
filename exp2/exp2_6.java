import java.util.Scanner;

public class exp2_6{
	public static void main(String args[]){
		int[][] t = new int[10][10];
		for (int i = 1; i <= 9; i++){
			for (int j = i; j <= 9; j++){
				t[i][j] = i * j;
			}
		}

		int a, b;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.printf("%d", t[a][b]);
	}
}