public class exp2_5{
	public static void main(String args[]){
		for (int i = 1; i <= 9; i++){
			for (int j = i; j <= 9; j++){
				System.out.printf("%d*%d=%d\t", i, j, i * j);
			}
			System.out.printf("\n");
		}
	}
}