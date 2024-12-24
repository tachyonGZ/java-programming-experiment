public class exp2_8{
	public static void main(String args[]){
		double a = 10000.0;
		int i = 1;
		for (; a < 20000.0; i++){
			a *= 1.07;
		}
		System.out.printf("%d", i);
	}
}