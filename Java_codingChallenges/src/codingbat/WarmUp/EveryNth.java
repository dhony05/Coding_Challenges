package codingbat.WarmUp;

public class EveryNth {

	
	/*
	 * 
	 * url:https://codingbat.com/prob/p196441
	 * 
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
	 * 
	 */
	
	public String everyNth(String str, int n) {
		  int len = str.length();
		  if(n< len ){
		    StringBuilder sb = new StringBuilder();
		    for(int i =0; i<len; i +=n){
		      sb.append(str.charAt(i));
		    }
		    return sb.toString();
		    
		}
		return str.substring(0,1);
		}

}
