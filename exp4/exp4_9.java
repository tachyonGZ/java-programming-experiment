import java.util.LinkedList;

public class exp4_8{
	public static void main(String[] args) {
		int total = 12;
		int count = 5;
		int last = findLastPerson(12, 5);
		System.out.println(last);
	}

	public static int findLastPerson(int total, int count){
		LinkedList<Integer> l = new LinkedList<>();

		for (int i = 1; i <= total; i++){
			l.add(i);
		}


		int index = 0;
		while (l.size() > 1){
			index = (index + count - 1) % l.size();
			l.remove(index);
		}

		return l.get(0);
	}
}