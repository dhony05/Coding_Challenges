package codingbat.Array1;

public class frontPieceChallenge {

	/***
	 * 
	 * url:https://codingbat.com/prob/p142455
Given an int array of any length, return a new array of its first 2 elements.
 If the array is smaller than length 2, use whatever elements are present.


frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
	 * @param nums
	 * @return
	 */
	public int[] frontPiece(int[] nums) {
		  int len = nums.length;
		  if(len <= 1){
		    return nums;
		  }
		  int[] resultArr  = new int[2];
		  resultArr[0] = nums[0];
		  resultArr[1] = nums[1];
		  return resultArr;
		}

}
