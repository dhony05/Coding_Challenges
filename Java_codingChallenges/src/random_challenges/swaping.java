package random_challenges;

public class swaping {

	
	/**
	 * Swapping two integers without using temporary variable
	 * @param args
	 */
	public static void main(String[] args){
	
		// testing 
		swap_integer(4,7);
		swap_integer(5,7);
		swap_integer(6,7);
		swap_integer(7,8);
	}
	
	public static void swap_integer(int a, int b){
		
		
		a = a + b;  // in the first case a = 11 because 4+7 = 11
		
		b = a - b; // b is equal to 4  because 11 - 7 =  4 
		
		a = a - b;  // a is change again a = 7 because  11 - 4 = 7
		
		System.out.println("a now is: " + a + " and b is now: "+ b);
		
	}
}
