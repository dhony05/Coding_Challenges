package codingbat.WarmUp2;

public class noTriplets {

	
	/**
	 * 
	 * url:https://codingbat.com/prob/p170221
	 * 
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.


noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
	 * 
	 * @param nums
	 * @return
	 */
	public boolean noTriples(int[] nums) {
		  if(nums.length<3){
		    return true;
		  }
		  int count = 0;
		  int temp = nums[0];
		  count = 1;
		  for(int i = 1; i< nums.length;i++){
		    if (nums[i] == temp){
		      count ++;
		    }else if (count == 3){
		      return false;
		    
		    }else {
		      
		      temp = nums[i];
		      count = 1;
		    }
		    
		  }
		  
		return false;
		  
	}
}
