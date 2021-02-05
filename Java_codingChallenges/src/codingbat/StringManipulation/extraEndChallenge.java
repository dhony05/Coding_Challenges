package codingbat.StringManipulation;

public class extraEndChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/***
	 * 
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.


extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
	 * @param str
	 * @return
	 */
	public static String extraEnd(String str) {
		int len = str.length();
		  return str.substring(len-2)+str.substring(len-2)+str.substring(len-2);
		}

}
