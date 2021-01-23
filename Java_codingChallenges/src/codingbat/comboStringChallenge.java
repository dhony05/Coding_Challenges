package codingbat;


/***
 * 
 * @author donelysfamilia
 * 
Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).


comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
 *
 */
public class comboStringChallenge {

	public static void main(String[] args) {
		System.out.println(comboString("aaa", "b"));

	}

	private static String comboString(String a, String b) {
		String result  = "";
	if(a.length()>b.length()) {
		 result = b.concat(a).concat(b);
	}else {
		result = a.concat(b).concat(a);
	}
		return result;
	}

}
