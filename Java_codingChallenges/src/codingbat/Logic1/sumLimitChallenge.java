package codingbat.Logic1;

import java.util.Random;

public class sumLimitChallenge {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(90);
		int n2 = rand.nextInt(90);
		System.out.println(n+ " "+n2);
		System.out.println(sumLimit(n, n2));
	}
	
	/***
	 * link:https://codingbat.com/prob/p118077
	 * Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
	 *  If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)


sumLimit(2, 3) → 5
sumLimit(8, 3) → 8
sumLimit(8, 1) → 9
	 * @param a
	 * @param b
	 * @return
	 */
	public  static int sumLimit(int a, int b) {
		  int sum = a + b;
		  int len = String.valueOf(sum).length();
		  int lenA = String.valueOf(a).length();
		  if(len> lenA){
		    return a;
		  }
		  return sum;
		}


}
