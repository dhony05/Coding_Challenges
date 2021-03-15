package codingbat.Array1;

public class makeMiddleChallenge {

/***
 * 
Given an array of ints of even length, return a new array length 2
 containing the middle two elements from the original array. 
 The original array will be length 2 or more.


makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
 * @param nums
 * @return
 */
	
	public int[] makeMiddle(int[] nums) {
		  int halfElement = (nums.length-1)/2;
		  int[] result = {nums[halfElement] , nums[halfElement+1]};
		  return result;
		}
}
