package codingbat.Array1;

public class swapEndsChallenge {

	/**
	 * link:https://codingbat.com/prob/p118044
	 * Given an array of ints, swap the first and last elements in the array.
	 *  Return the modified array. The array length will be at least 1.


swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
	 * @param nums
	 * @return
	 */
	public int[] swapEnds(int[] nums) {
		  
		  int lastI = nums.length -1 ;
		  if( lastI+ 1 >1){
 
		  nums[0] = nums[0] + nums[lastI];
		  nums[lastI] = nums[0] - nums[lastI];
		  nums[0] = nums[0] - nums[lastI];
		  
		  }
		  return nums;
		}

}
