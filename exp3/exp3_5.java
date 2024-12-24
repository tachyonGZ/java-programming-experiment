import java.util.Scanner;

public class exp3_5{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		Rectangle r = new Rectangle();
		while (true){
			System.out.printf("土地长：");
			r.a = s.nextInt();
			System.out.printf("土地宽：");
			r.b = s.nextInt();
			System.out.println("土地面积：" + r.area());
			System.out.println("土地周长：" + r.circumference());
		}
	}
}

public class Rectangle{
	public int a;

	public int b;

	public int area(){
		return this.a * this.b;
	}

	public int circumference(){
		return 2 * (this.a + this.b);
	}
}