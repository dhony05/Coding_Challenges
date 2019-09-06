package LeetCode;


import java.awt.List;
import java.util.Arrays;
import java.util.HashSet;





public class SumReturn {
	
	
	public static int[] twoSum(int[] nums, int target) {
		boolean isFound = false;
		Integer[] numList = Arrays.stream( nums ).boxed().toArray( Integer[]::new );
		int[] index = new int[2];
		int temp = 0 ;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			 temp = target - nums[i];
			//System.out.println(temp);
		if(set.contains(temp)) {
			System.out.println(set  +" working");
			isFound = true;
			
		}
		else if(isFound) {
			//System.out.println(set  +" working");
			break;
			
		} 
		else if(temp + nums[i] == target && (!(temp == nums[i]))) {
			isFound = true;
			set.add(temp); index[0] = Arrays.asList(numList).indexOf(nums[i]);
			set.add(nums[i]);index[1] = Arrays.asList(numList).indexOf(temp);
		
			
		} 
		
		}
		
		return index;
	}

	public static void main(String[] args) {
		int[] newA = {2,3,1,7,11,15};
		int[] newB = {3,2,4};
		System.out.println(Arrays.toString(twoSum(newA,9)));
		System.out.println(Arrays.toString(twoSum(newB,6)));
	}
}
