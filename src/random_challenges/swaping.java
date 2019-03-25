package random_challenges;

public class swaping {

	
	/**
	 * Swapping integers without using temporary variable
	 * @param args
	 */
	public static void main(String[] args){
	
		swap_integer(4,7);
		swap_integer(5,7);
		swap_integer(6,7);
		swap_integer(7,8);
	}
	
	public static void swap_integer(int a, int b){
		
		
		int arrayInt[] = new int[2];
		arrayInt[0] = a;
		arrayInt[1] = b;
		
		a = arrayInt[1];
		b = arrayInt[0];
		
		System.out.println("a now is: " + a + " and b is now: "+ b);
		
	}
}
