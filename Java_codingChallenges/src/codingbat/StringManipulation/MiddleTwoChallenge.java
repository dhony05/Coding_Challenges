package codingbat.StringManipulation;

public class MiddleTwoChallenge {

	/***
	 * 
	 * 
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.


middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
	 * @param args
	 */
	
	
	
	/***
	 * 
	 * 
Given a string, return true if it ends in "ly".


endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(endsLy("oddly"));
		System.out.println(middleTwo("Practice"));
	}
	public static String middleTwo(String str) {
		  int len = str.length();
		  return str.substring((len/2)-1, (len/2)+1);
		}
	
	
	public static boolean endsLy(String str) {
		  return str.endsWith("ly");
		}
}
