package codingbat.WarmUp;

public class EndUpChallenge {

	
/**
 * 
 * url: https://codingbat.com/prob/p125268
 * 
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.


endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 * @param str
 * @return
 */
	public String endUp(String str) {
		  int len = str.length();
		  if( len <= 3){
		    return str.toUpperCase();
		  }
		  return str.substring(0,len-3) + str.substring(len-3).toUpperCase();
		  
		}

}
