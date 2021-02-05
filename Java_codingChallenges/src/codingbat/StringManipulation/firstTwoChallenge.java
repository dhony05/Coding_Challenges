package codingbat.StringManipulation;

public class firstTwoChallenge {

	public static void main(String[] args) {
		System.out.println(firstTwo("abcdefg"));

	}
	
	/***
	 * 
Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.


firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
	 * @param str
	 * @return
	 */
	public static String firstTwo(String str) {
		  int len = str.length();
		  if(len<2){
		    return str;
		  }
		  return str.substring(0,2);
		}


}
