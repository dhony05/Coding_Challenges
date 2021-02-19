package codingbat.Logic1;

import java.util.Random;

public class lessBy10Challenge {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(100);
		int n2 = rand.nextInt(100);
		int n3 = rand.nextInt(100);
		System.out.println(n+ " "+n2+" "+ n3);
		System.out.println(lessBy10(n, n2, n3));

	}
	/**
	 * link:https://codingbat.com/prob/p179196
	 * 
	 * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.


lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static boolean lessBy10(int a, int b, int c) {
		 
		  return (
		    ((a+10)<=b)||
		    ((a+10)<=c)||
		    ((b+10)<=c)||
		    ((b+10)<=a)||
		    ((c+10)<=a)||
		    ((c+10)<=b)
		    );
		}


}
