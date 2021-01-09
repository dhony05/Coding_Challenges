package random_challenges;

public class PalindromeNum {

	public static void main(String[] args) {
		System.out.println(isPalidrome(1254));
		System.out.println(isPalidrome(1254521));

	}

	private static boolean isPalidrome(int i) {
		int reversedStack = 0;
		int tempI = i;
		
		while(tempI>0) {
			
			reversedStack = tempI%10 + reversedStack*10;
			//take the last number and add it to the stack 
			// if tempStack has already a number it multiply by 10 and add the next number to the stack
			System.out.println(reversedStack);
			
			tempI /=10;
			//take out the last number 
		}
		
		if(i == reversedStack) {
			return true;
		}
		return false;
		
	}
	
	
	

}
