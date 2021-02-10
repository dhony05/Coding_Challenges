package codingbat.Logic1;

public class less20Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * link:https://codingbat.com/prob/p133158
	 * Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod


less20(18) → true
less20(19) → true
less20(20) → false
	 * @param n
	 * @return
	 */
	public static boolean less20(int n) {
		  return (((n+1)%20==0)||((n+2)%20==0));
		}

}
