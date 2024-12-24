public class exp2_4{
	public static void main(String args[]){
		System.out.printf("%d", foo(1, 2, 1));
	}

	public static int foo(int sum, int i, int last)
	{
		last *= i;
		if ((sum += last) <= 9876)
		{
			return foo(sum, i + 1, last);
		}
		else
		{
			return i - 1;
		}
	}
}