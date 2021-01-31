package codingbat.StringManipulation;

public class withoutEnd {

	/**
	 * 
	 * 
	Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.


	withoutEnd("Hello") → "ell"
	withoutEnd("java") → "av"
	withoutEnd("coding") → "odin"
	 */
	public static void main(String[] args) {
		
		System.out.println(withoutEnd("coding"));
	}

	private static String withoutEnd(String string) {
		StringBuilder sb = new StringBuilder(string); 
		sb.deleteCharAt(0);
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}

}
