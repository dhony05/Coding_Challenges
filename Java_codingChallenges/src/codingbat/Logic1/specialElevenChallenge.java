package codingbat.Logic1;

public class specialElevenChallenge {

	public static void main(String[] args) {
		System.out.println(specialEleven(24));

	}
	
	/**
	 * link:https://codingbat.com/prob/p100962
We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod


specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false
	 * @param n
	 * @return
	 */
	public static boolean specialEleven(int n) {
		  return ((n%11==0)||((n-1)%11 ==0));
		}


}
