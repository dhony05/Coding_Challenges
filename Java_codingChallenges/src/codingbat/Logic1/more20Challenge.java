package codingbat.Logic1;

public class more20Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/***
	 * link:https://codingbat.com/prob/p118290
	 * Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod


more20(20) → false
more20(21) → true
more20(22) → true
	 * @param n
	 * @return
	 */
	public boolean more20(int n) {
		  return (((n-1)%20 ==0)||((n-2)%20 ==0));
		}


}
