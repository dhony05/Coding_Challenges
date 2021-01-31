package codingbat.StringManipulation;

public class frontAgainChallenge {


	public static void main(String[] args) {
		System.out.println(frontAgain("edited"));

	}
	
	
	/***
	 * 
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".


frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
	 * @param args
	 */
	public static boolean frontAgain(String str) {
		  if(str.length()<2){
		    return false;
		  }
		  return str.endsWith(str.substring(0,2));
		}


}
