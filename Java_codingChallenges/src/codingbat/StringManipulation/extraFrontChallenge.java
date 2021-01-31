package codingbat.StringManipulation;

public class extraFrontChallenge {

	
	public static void main(String[] args) {
		System.out.println(extraFront("ab"));

	}
	/**
	 * Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.


extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
	 */
	
	public static String extraFront(String str) {
		  StringBuilder sb = new StringBuilder();
		  if(str.length()<2){
		  for(int i = 0; i<3;i++){
		    sb.append(str.substring(0));
		  }
		  return sb.toString();
		  }
		  for(int i = 0; i<3;i++){
		    sb.append(str.substring(0,2));
		  }
		  return sb.toString();
		}


}
