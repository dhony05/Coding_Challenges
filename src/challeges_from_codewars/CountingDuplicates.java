package challeges_from_codewars;
import java.util.Arrays;

/*
Count the number of Duplicates

Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

Example

"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice

*/

/******SOLVED */
/** 
 * Algorithm I used was Convert to lowercase ,Sort it then covert it to
 * String[] to iterate and compare , also compare with a temp variable
 *  if is not equal to the temp but it equal to current idex then count
 *  should be incremented
 * then return count
 */
public class CountingDuplicates{

    public static void main(String[] args) {
        // TESTING
       duplicateCount("abcde");
       duplicateCount("aabbcde");
       duplicateCount("aabBcde");
       duplicateCount("indivisibility");
       duplicateCount("Indivisibilities");
       duplicateCount("aA11");
       duplicateCount("abcdeaB");

    }
    
     

    public static int duplicateCount(String text) {
        int count = 0;
        System.out.println(text);
        String[] newString = text.toLowerCase().split("");
        Arrays.sort(newString);

        String temp = "";
        for (int i = 0; i < text.length()-1; i++) {
            if((newString[i].equals(newString[i+1])&& (!(newString[i].equals(temp))))){
                count ++;
                temp = newString[i];
                
            }
            
        }


    System.out.println(Arrays.toString(newString));
    System.out.println(count);
        return count;
        }

        // Write your code here
      }
    