package codingbat.WarmUp;

public class IntMax {

	/***
	 * 
	 * url: https://codingbat.com/prob/p101887
	 * 
Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	
	public int intMax(int a, int b, int c) {
		  int currentMin = Math.max(a,b);
		  return Math.max(currentMin, c);
		}

}
