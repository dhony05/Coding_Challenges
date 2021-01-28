package codingbat;

public class atFirstChallenge {

	/**
	 * Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.


atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(atFirst("hi"));

	}
	
	public static String atFirst(String str) {
		  
		String result = "";
		  if(str.length()<2){
		    
		    if(str.equals(result)){
		      result = "@@";
		      return result;
		      
		    }else{
		    result = str + "@";
		    return result;
		  }
		  }
		  return str.substring(0,2);
		}

}
