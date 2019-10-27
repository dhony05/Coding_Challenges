package random_challenges;

import java.util.ArrayList;
import java.util.List;



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
		String[] newA = {"toot","hello", "aabaa"};
		getPalindromes(newA);
		System.out.println(getPalindromes(newA));
		
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
	
	
	/// one line?
	public static List getPalindromes(String[] str) {
		
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
//			if(str[i].charAt(0) == str[i].charAt(str[i].length()-1)) {
//				result.add(str[i]);
//			}
			
			//We can do this or just the previous method
			
			if(isPalindrome(str[i])) {
				result.add(str[i]);
			}
		}
		//System.out.println(result);
		return  result;
		
	}
	
	
	
	
}
