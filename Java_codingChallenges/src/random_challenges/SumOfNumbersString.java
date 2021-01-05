package random_challenges;

public class SumOfNumbersString {

	public static void main(String[] args) {
		
		sumOfNums("eso1y20");//21
		sumOfNums("ya3mil90m");//93
		sumOfNums("c0v1d-19");//20
		sumOfNums("klk9n0pr42i4");//55
		sumOfNums("num24rrt43");//67
		sumOfNums("esoy3yrt450");//453
		sumOfNums("chris12323413414134abc");

	}
	
	
	
	public static long sumOfNums(String str) {
		long currentSum = 0;
		long maxSum = 0;
		
		for(int i = 0; i< str.length(); i++) {
			if(Character.isDigit(str.charAt(i)) &&(currentSum == 0)) {
				currentSum = Integer.parseInt(String.valueOf(str.charAt(i)));	
			}
			else if((Character.isDigit(str.charAt(i))&& (currentSum != 0))){	
				currentSum  = (currentSum * 10) +Integer.parseInt(String.valueOf(str.charAt(i)));    
			
			}else {
				maxSum += currentSum;
				currentSum = 0;
				
			}
			System.out.println(currentSum +".."+ maxSum);
			
		}
		maxSum += currentSum;
		
		System.out.println(maxSum);
		
		return maxSum;
	}

}
