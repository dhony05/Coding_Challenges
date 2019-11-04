package LeetCode;

import java.util.Stack;

public class FindLasgestCommonPref {

	public static void main(String[] args) {
		
		longestCommonPrefix(new String[] {"flower","flow","fly"});
		longestCommonPrefix(new String[] {"dog","racecar","car"});

	}
	
	public static String longestCommonPrefix(String[] strs) {
		int min = strs.length * strs.length;
		String minSt = "";
		for (int i = 0; i < strs.length; i++) {
			if(strs[i].length()<= min) {
				minSt = strs[i];
				min = strs[i].length();
				
			}
			
		}
		for (int i = 0; i < strs.length; i++) {
			if(strs[i].startsWith(minSt.substring(0,minSt.length()/1))){
				System.out.println(minSt.substring(minSt.length()));
			}
		}
		
		
		//System.out.println(minSt+ ": " + min);
			
		// need a solution
        return null;
    }

}
