package codingbat.StringManipulation;

public class withOurX2Challenge {

	public static void main(String[] args) {
		System.out.println(withoutX2("Hxi"));

	}
	
	/**
	 * 
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
	 */
	
	public static String withoutX2(String str) {
		  int len = str.length();
		  if(str.contains("x")){
		    if(len<2){
		      return "";
		    }
		    if(str.startsWith("x") && str.substring(1,2).equals("x")) {
		      return str.substring(2);
		    }else if(str.startsWith("x")){
		      return str.substring(1);
		    }else if(str.substring(1,2).equals("x")){
		      return str.substring(0,1) + str.substring(2);
		    }
		    
		  }
		 return str;
		}

}
