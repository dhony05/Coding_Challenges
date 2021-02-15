package codingbat.Logic1;

import java.util.Random;

public class twoAsOneChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int n = rand.nextInt(10);
		int n2 = rand.nextInt(10);
		int n3 = rand.nextInt(10);
		System.out.println(n+ " "+n2+" "+ n3);
		System.out.println(twoAsOne(n, n2, n3));
	}
	/**
	 * 
Given three ints, a b c, return true if it is possible to add two of the ints to get the third.


twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	
	public static boolean twoAsOne(int a, int b, int c) {
		  return ((a+b)==c||(a+c)==b||(c+b)==a);
		}


}
