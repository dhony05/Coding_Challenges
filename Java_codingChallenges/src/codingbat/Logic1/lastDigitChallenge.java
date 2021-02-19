package codingbat.Logic1;

import java.util.Random;

public class lastDigitChallenge {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(100);
		int n2 = rand.nextInt(100);
		int n3 = rand.nextInt(100);
		System.out.println(n+ " "+n2+" "+ n3);
		System.out.println(lastDigit(n, n2, n3));

	}
	
	/**
	 * link:https://codingbat.com/prob/p169213
	 * 
Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.


lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static boolean lastDigit(int a, int b, int c) {
		  return (
				  (a%10 ==b%10)||
				  (a%10 ==c%10)||
				  (c%10 ==b%10)
				  );
		}


}
