package random_challenges;

public class ReversingInteger {

	public static void main(String[] args) {
		reverseInt(4501);
		reverseInt(45);
		

	}

	private static int reverseInt(int i) {
		int tempStack = 0;
		int tempI = i;
		int sum = 0;
		while(tempI > 0 ) {
			tempStack = tempI%10 + sum;
			sum = tempStack*10;
			tempI = tempI /10;
			
			//System.out.println(tempStack);
		}
		System.out.println("Original integer: " + i);
		System.out.println("Reversed integer: " + tempStack);
		return tempStack;
	}

}
