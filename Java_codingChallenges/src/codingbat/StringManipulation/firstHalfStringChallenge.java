package codingbat.StringManipulation;

public class firstHalfStringChallenge {

	/***
	 * 
	 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


		firstHalf("WooHoo") → "Woo"
		firstHalf("HelloThere") → "Hello"
		firstHalf("abcdef") → "abc"
	 */
	public static void main(String[] args) {
		System.out.println(firstHalf("HelloWorld"));

	}
	
	public static String firstHalf(String str) {
		  return str.substring(0,str.length()/2);
		}


}
