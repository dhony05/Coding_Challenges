package codingbat.Logic1;

public class inOrderChallenge {

	public static void main(String[] args) {
		System.out.println(inOrder(1, 1, 2, true) );

	}
	
	/**
	 * 
	 * link:https://codingbat.com/prob/p154188
Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.


inOrder(1, 2, 4, false) → true
inOrder(1, 2, 1, false) → false
inOrder(1, 1, 2, true) → true
	 * @param a
	 * @param b
	 * @param c
	 * @param bOk
	 * @return
	 */
	public static boolean inOrder(int a, int b, int c, boolean bOk) {

	    if(bOk) {
	    		return ((((a==b)||(b<c))) || ((a<b)&&(b<c)));
//	      return true;
	    }
	    return false;
	  }


}
