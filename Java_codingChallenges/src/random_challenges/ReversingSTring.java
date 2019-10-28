package random_challenges;

import java.util.Stack;

public class ReversingSTring {

	public static void main(String[] args) {
		ReverseString("hello");
		ReverseString2("hello");
	}

	public static void ReverseString(String string) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(string);
		sb = sb.reverse();
		System.out.println(sb);
		
	}
	
	
	public static String ReverseString2(String str) {
		Stack<Character> toReverse = new Stack<Character>();
		
		
		for (int i = 0; i < str.length(); i++) {
			char inChar = str.charAt(i);
			toReverse.push(inChar);
			System.out.println(toReverse);	
			
		}

		
		String newStr = "";
		while(!toReverse.isEmpty()) {
			newStr += toReverse.pop();
		}
		System.out.println(newStr);
		return newStr;
		
	}
	
	

}
