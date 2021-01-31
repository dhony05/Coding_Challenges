package codingbat.StringManipulation;

public class nonStartChallenge {

	
	/****
	 * 
	 * 
	Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.


	nonStart("Hello", "There") → "ellohere"
	nonStart("java", "code") → "avaode"
	nonStart("shotl", "java") → "hotlava"
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(nonStart("shotl", "java") );

	}

	private static String nonStart(String a, String b) {
		String newStr = "";
		return newStr.concat(a.substring(1)).concat(b.substring(1));
	}

}
