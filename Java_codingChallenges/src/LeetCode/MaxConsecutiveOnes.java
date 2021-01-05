package LeetCode;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] a = {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(a));
		

	}
	
	public static  int findMaxConsecutiveOnes(int[] nums) {
        int maxN = 0;
        int  currentSum = 0;
        for(int i = 0; i< nums.length; i++){
           
        	if(nums[i] == 1) {
        		currentSum += 1;
        		
        	}else {
        	    
        		if(maxN < currentSum){
        	    	maxN = currentSum;
        		}
        	    	currentSum = 0;
        	    }
        	
        	if(maxN < currentSum) {
        		maxN = currentSum;
        	}
        	
        	
        	}
        
        
        
        return maxN;
    }

}
