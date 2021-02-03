package codingbat.StringManipulation;

public class deFrontChallenge {

	public static void main(String[] args) {
		System.out.println(deFront("away"));

	}
	
	/**
	 * 
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
	 */
	public static String deFront(String str) {
		  
		  if(str.startsWith("ab")){
		    return str;
		  }
		  if(str.startsWith("a")){
		    return str.substring(0,1) + str.substring(2);
		  }
		  if(str.substring(1,2).equals("b")){
		    return str.substring(1);
		  }
		  return str.substring(2);
		}


}
