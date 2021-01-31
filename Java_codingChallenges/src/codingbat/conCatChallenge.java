package codingbat;

public class conCatChallenge {

/**
 * Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
 * @param args
 */
	public static void main(String[] args) {
		System.out.println(conCat("dog", "cat"));

	}
	
	public static String conCat(String a, String b) {

		   String result = "";
		   if(a.equals("") || b.equals("")){
		     result = a + b;
		   }
		   else if(a.charAt(a.length()-1) == b.charAt(0)){
		     result = a + b.substring(1);
		   }
		   else {
		     result = a + b;
		   }
		   return result;
		   
		}



}
