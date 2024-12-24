public class exp4_4{
	public static void main(String args[]){
		String s1 = new String("数学87分，物理76分，英语96分");
		String[] s2 = s1.split("，");

		int total = 0;
		for (String s3 : s2){
			total += Integer.parseInt(s3.replaceAll("[^0-9]", ""));
		}

		double average = (double) total / s2.length;

		System.out.println(total);
		System.out.println(average);
	}
}