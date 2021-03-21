package challeges_from_codewars;

public class BreakCamelCaseChallenge1 {

	public static void main(String[] args) {
		System.out.println(camelCase("camelCasing"));

	}
	
	
	/**
	 * url: https://www.codewars.com/kata/5208f99aee097e6552000148/train/java
	 * Complete the solution so that the function will break up camel casing, using a space between words.
	 * @param input
	 * @return
	 */
	
	  public static String camelCase(String input) {
		    StringBuilder sb = new StringBuilder();
		    char[] in = input.toCharArray();
		    for(char c : in) {
		    	if(isUpercase(c)) {
		    		sb.append(" ");
		    	}
		    	sb.append(c);
		    }
		    return sb.toString();
		  }
	  
	  public static boolean isUpercase (char c) {
		  return (((int)c >= 65 )&& ((int)c <= 90 ));
	  }

}
