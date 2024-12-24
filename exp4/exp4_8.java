public class exp4_8{
	public static void main(String[] args) {
	}
	
	public static boolean binarySeach(String[] dictionary, String target){
		int left = 0;
		int right = dictionary.length - 1;

		while (left <= right){
			int mid = (left + right) / 2;
			int cmp = dictionary[mid].compareTo(target);
			if (0 == cmp){
				return true;
			}else if(0 < cmp){
				left = mid + 1;
			}else{
				right = mid - 1;
			}
		}

		return false;
	}
}