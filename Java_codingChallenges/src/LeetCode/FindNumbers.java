package LeetCode;

public class FindNumbers {

	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};

		System.out.println(findNumbers(nums));
	}
	
	 public static int findNumbers(int[] nums) {
	        int outCount = 0;
	        for(int a : nums){
	            if(countDigits(a)%2 == 0){
	                outCount ++;
	            }
	        }
	        
	        return outCount;
	        
	        
	    }
	    
	    
	    public static int countDigits(int n){
	        
	        int count = 0;
	        while(n > 0){
	            count ++;
	            n = n/10;
	        }
	        return count;
	        
	    }

}
