package codingbat.StringManipulation;

public class rotateLeft2 {

	/***
	 * 
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.


left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
	 * @param args
	 */
	public static void main(String[] args) {
		

		System.out.println(left2("Hi"));
		System.out.println(left2("java"));
	}

	private static String  left2(String str ){
		if(str.length()>2) {
			StringBuilder sb = new StringBuilder(str);
			sb.delete(0, 2);
			sb.append(str.charAt(0)).append(str.charAt(1));
			return sb.toString();
		}
		return str;
	}

}
