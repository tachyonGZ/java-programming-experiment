import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class exp4_6{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();
		int m = scanner.nextInt();

		MyCalendar c = new MyCalendar();
		c.getCalendar(y, m);
	}
}

public class MyCalendar{
	void getCalendar(int y, int m){
		Calendar c = new GregorianCalendar(y, m -1, 1);
		int dow = c.get(Calendar.DAY_OF_WEEK);
		int dim = c.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.println("S\tM\tT\tW\tT\tF\tS");

        for (int i = 1; i < dow; i++) {
            System.out.print("\t");
        }

		for (int day = 1; day <= dim; day++) {
            System.out.print(day + "\t");
            if ((dow + day - 1) % 7 == 0) {
                System.out.println();
            }
        }
	}
}