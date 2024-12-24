import java.util.Scanner;

public class exp2_2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int sum = 0, cnt = 0;
		while (true)
		{
			int n = s.nextInt();
			if (n == 0)	break;
			sum += n;
			cnt += 1;
		}
		System.out.println((double)sum / cnt);
	}
}