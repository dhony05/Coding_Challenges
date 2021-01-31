package codingbat.StringManipulation;

public class without2StringChallenge {

	public static void main(String[] args) {
		System.out.println(without2("HelloHe"));

	}
	
	/***
	 * 
Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.


without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""
	 */
	public static String without2(String str) {
		  int len = str.length();
		  if((len == 1)|| (len==3)) return str.substring(len-1);
		  
		  if((len == 2)||(len==0)) return "";
		  
		  if(str.endsWith(str.substring(0,2))) return str.substring(2);

		  return str;

		}


}
