package codingbat;

public class HasBadChallenge {

	/***
	 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.


hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(hasBad("xxbadxx"));

	}
	public static boolean hasBad(String str) {
		  int len =str.length();
		  if((len< 3)|| (str.startsWith("x")&&(len==3))){
		    return false;
		  }
		  else if(str.equals("bad")){
		    return true;
		  }else if((str.substring(0,3).equals("bad"))||(str.substring(1,4).equals("bad"))){
		    return true;
		  }
		  return false;
		}


}
