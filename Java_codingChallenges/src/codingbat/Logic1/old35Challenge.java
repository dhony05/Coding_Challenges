package codingbat.Logic1;

public class old35Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod


old35(3) → true
old35(10) → true
old35(15) → false
	 * @param n
	 * @return
	 */
	public static boolean old35(int n) {
		  return  (((n%3==0) && (n%5>0)) || ((n%3>0) && (n%5==0)));
		   
		  
		}


}
