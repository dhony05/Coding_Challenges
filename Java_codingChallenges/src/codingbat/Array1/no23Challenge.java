package codingbat.Array1;

public class no23Challenge {

	/**
	 *link: https://codingbat.com/prob/p175689
Given an int array length 2, return true if it does not contain a 2 or 3.


no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
	 * @param nums
	 * @return
	 */
	public boolean no23(int[] nums) {
		  return (nums[0] != 2 &&  nums[0] != 3 && nums[1] != 2 && nums[1] != 3);
		}

}
