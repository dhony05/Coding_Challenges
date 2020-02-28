package random_challenges;
import java.util.*; 

public class possiblePal {

	public static char makePalindrome(String mjono) {

        StringBuilder sb = new StringBuilder(mjono);
        char temp = ' ';


        for (int i = 0; i < mjono.length(); i++) {
        	temp = sb.charAt(i);
            sb.deleteCharAt(i);
            

            if(isPalindrome(sb.toString())){
            	System.out.println(temp);
                return temp;
            } else {
            	
                sb.insert(i, mjono.charAt(i));
                
            }
        }
        return 'n';
    }

    private static boolean isPalindrome(String string) {
        return string.equals(new StringBuilder(string).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(makePalindrome("ABCBXA"));
        System.out.println(makePalindrome("ABCBAX"));
        System.out.println(makePalindrome("ABCXBA"));
        System.out.println(makePalindrome("ABCDE"));
        System.out.println(makePalindrome("BAAAAC"));
    } 
	} 

