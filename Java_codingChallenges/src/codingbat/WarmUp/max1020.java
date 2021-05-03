package codingbat.WarmUp;

public class max1020 {

	/**
	 * url:https://codingbat.com/prob/p177372
	 * 
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.


max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
	 * @param a
	 * @param b
	 * @return
	 */
	
	public int max1020(int a, int b) {
		  int maxNum = Math.max(a,b);
		  int minNum = Math.min(a,b);
		  if(a<10 && b>20){
		    return 0;
		  }
		  if(maxNum >20){
		    return minNum;
		  }
		  return maxNum;
		  
		  
		  
		  
		}

}
