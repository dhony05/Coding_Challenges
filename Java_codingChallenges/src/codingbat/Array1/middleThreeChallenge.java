package codingbat.Array1;

public class middleThreeChallenge {

	/**
	 * link:https://codingbat.com/prob/p155713
	 * Given an array of ints of odd length, 
	 * return a new array length 3 containing the elements from the middle of the array.
	 *  The array length will be at least 3.


midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
	 * @param nums
	 * @return
	 */
	public int[] midThree(int[] nums) {
		  int len = nums.length;
		  if(len <= 3){
		    return nums;
		  }
		  int[] newArr = new int[3];
		  int starting = (len-1)/2 ;
		  newArr[0] = nums[starting - 1];
		  newArr[1] = nums[starting];
		  newArr[2] = nums[starting + 1];
		  
		  return newArr;
		  
		}
	
	//with loops
	public int[] midThreeWithLoop(int[] nums) {
		  int len = nums.length;
		  if(len <= 3){
		    return nums;
		  }
		  int[] newArr = new int[3];
		  int starting = (len-1)/2 ;
		  starting -= 1;
		  for (int i = 0; i < newArr.length; i++) {	  
		  newArr[i] = nums[starting];
		}
		  return newArr;
		
		}

}
