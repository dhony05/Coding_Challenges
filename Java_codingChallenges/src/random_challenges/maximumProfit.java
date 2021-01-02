package random_challenges;

public class maximumProfit {

	
	/***
	 * Given a array of numbers representing the stock prices of a company in chronological order,
	 * write a function that calculates the maximum profit you could have made from buying  and selling that stock once.
	 * You must buy before you can sell it.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[] a1 = {9,11,8,5,7,10};
		System.out.println(getMaxProfit(a1));
		System.out.println(getMaxProfit2(a1));

	}
	
	
	public static int getMaxProfit(int[] arr) {
		int tempMaxProf = 0;
		int currentProf = 0;
		
		for (int i = 0; i < arr.length; i++) {
			 
			for (int j = i+1; j < arr.length; j++) {
				currentProf =  arr[j] - arr[i];
			
				if(tempMaxProf< currentProf) {
					tempMaxProf = currentProf;
				}
			}
		}
		

		return tempMaxProf;
	}

	
	public static int getMaxProfit2(int[] arr) {
		
		int maxProf = 0;
		int currentProf = 0;
		
		for (int i = 0; i < arr.length-1; i++) {

			if(arr[i+1] > arr[i] ) {
				currentProf += arr[i+1] - arr[i];
			}

			else {
				currentProf = 0;
			}
			
			if(maxProf< currentProf) {
				maxProf = currentProf;
				
			}
			
		}
		return maxProf;
		
	}
}
