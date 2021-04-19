package codingbat.WarmUp;

public class MixStartChallenge {

/**
 * 
 * url:https://codingbat.com/prob/p151713
 * 
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false	

 * @param str
 * @return
 */
	public boolean mixStart(String str) {
		  return str.contains("ix");
		}

}
