package codingbat.Logic1;

import java.util.Random;

public class shareDigitChallenge {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(90);
		int n2 = rand.nextInt(90);
		System.out.println(n+ " "+n2);
		System.out.println(shareDigit(n, n2));

	}
	
	/**
	 * link:https://codingbat.com/prob/p153748
Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)


shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean shareDigit(int a, int b) {
		  return ((a/10 == b/10)||(a/10 == b%10) ||(a%10 == b/10)||(a%10 == b%10));
		    
		  
		}





}
