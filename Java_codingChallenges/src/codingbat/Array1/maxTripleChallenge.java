package codingbat.Array1;

public class maxTripleChallenge {

	/**
	 * link: https://codingbat.com/prob/p185176
	 * Given an array of ints of odd length, 
	 * look at the first, last, and middle values in the array and return the largest.
	 *  The array length will be a least 1.


maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
	 * @param nums
	 * @return
	 */
	public int maxTriple(int[] nums) {
		  int len = nums.length;
		  if(len >=3){
		    return getMax(nums[0],nums[((len-1)/2)],nums[len-1]);
		  }
		  return nums[0];
		}

		public int getMax(int a, int b , int c){
		  int max = Math.max(a,b);
		  max = Math.max(max,c);
		  return max;
		}

}
