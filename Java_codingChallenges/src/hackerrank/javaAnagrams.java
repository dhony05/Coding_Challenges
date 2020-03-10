package hackerrank;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class javaAnagrams {

	
	/***
	 * 
	 * Two strings,A and B , are called anagrams if they contain all the same characters in the same frequencies. 
	 * For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

		Complete the function in the editor. If A and B are case-insensitive anagrams, print "Anagrams";
		 otherwise, print "Not Anagrams" instead.
	 * @param args
	 */
	
	// this  way is the slowest way to do it 
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		
	}
	
	 /***
	  * This method will return a boolean whether if A is anagram of  B
	  * @param a
	  * @param b
	  * @return  boolean
	  */
	public static boolean isAnagram(String a , String b) {
		
		ArrayList<String> newA = new  ArrayList(Arrays.asList(a.toLowerCase().split("")));
		
		ArrayList<String> newB = new  ArrayList(Arrays.asList(b.toLowerCase().split("")));
		
		Collections.sort(newA);
		Collections.sort(newB);
		
		if(newA.containsAll(newB)) {
			return true;
		}
		else {
			return false;
		}
		
		
		
	}

}
