import java.util.HashMap;
import java.util.Map;

public class exp4_10{
	public static void main(String args[]){
		int[][] nums = {{2,7,11,15}, {3,2,4}, {3,3}};
		int[] targe = {9, 6, 6};

		for (int i = 0; i < 3; i++){
			int[] res = find2sum(nums[i], targe[i]);
			System.out.println("[" + res[0] + "," + res[1] + "]");
		}
	}
	public static int[] find2sum(int[] nums, int target){
		Map<Integer, Integer> m = new HashMap<>();

		for (int i = 0; i < nums.length; i++){
			int complement = target - nums[i];
			if (m.containsKey(complement)){
				return new int[] {m.get(complement), i};
			}
			m.put(nums[i], i);
		}

		return null;
	}
}