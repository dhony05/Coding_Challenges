package codingbat;

public class lastCharsChallenge {

	/**
	 * 
	 * 
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.


lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(lastChars("yo", "java"));

	}
	
	
	public static String lastChars(String a, String b) {
		  StringBuilder sb = new StringBuilder();
		  int aLen = a.length();
		  int bLen = b.length();
		  
		  if((aLen == 0) && (bLen != 0)){
		    sb.append("@");
		    sb.append(b.substring(bLen -1));
		  }else if((aLen != 0) && (bLen == 0)){
		    
		    sb.append(a.substring(0,1));
		    sb.append("@");
		  
		  }else if((aLen == 0) && (bLen == 0)){
		    sb.append("@");
		    sb.append("@");
		  }
		  else {
		    sb.append(a.substring(0,1));
		    sb.append(b.substring(bLen -1));
		  }
		  return sb.toString();

		}


}
