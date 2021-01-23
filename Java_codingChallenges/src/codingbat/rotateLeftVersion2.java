package codingbat;

public class rotateLeftVersion2 {

	
	/***
	 * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.


right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"

	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(right2("Hi"));
		System.out.println(right2("Hello"));
	}
	//constant time

	private static String right2(String str) {
		if(str.length()>2) {
			StringBuilder sb = new StringBuilder();
			sb.append(str.substring(str.length()-2));
			sb.append(str.substring(0,str.length()-2));

			return sb.toString();
		}
		return str;
	}


}
