package codingbat.Array1;

public class fix23Challenge {

	/**
	 * link: https://codingbat.com/prob/p120347
	 * 
Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
 set the 3 element to 0. Return the changed array.


fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]

	 * @param nums
	 * @return
	 */
	public int[] fix23(int[] nums) {
		  // since we are not using loops 
		  
		  if (is2FollowedBy3(nums[0],nums[1])){
		    nums[1] = 0;
		  }else if (is2FollowedBy3(nums[1],nums[2])){
		    nums[2] = 0;
		  }
		  return nums;
		}

		// helper method
		public boolean is2FollowedBy3 (int a , int b){
		  return ((a == 2) && (b == 3));
		}

}
