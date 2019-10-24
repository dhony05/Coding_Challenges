package random_challenges;


/***
 * 
 * @author donelysfamilia
 * This is a challenge to check if a string is a palindrome
 *
 */
public class palindromeCheck {

	
	
	public static void main(String[] args) {
		String str = "Hello";
		
		
		isPalindrome(str);
		isPalindrome("Toot");
	}
	
	
	public static boolean isPalindrome(String str) {
		StringBuilder sb  = new StringBuilder();
		sb.append(str);
		if(str.equalsIgnoreCase(sb.reverse().toString())) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
			
		}
	}
	
}
