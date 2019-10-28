package random_challenges;

import java.util.Stack;

public class ReversingSTring {

	public static void main(String[] args) throws InterruptedException {
		ReverseString("hello");
		ReverseString2("hello");
		ReverseString3("hello");
	}

	public static void ReverseString(String string) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(string);
		sb = sb.reverse();
		System.out.println(sb);
		
	}
	
	
	public static String ReverseString2(String str) throws InterruptedException {
		Stack<Character> toReverse = new Stack<Character>();
		
		
		for (int i = 0; i < str.length(); i++) {
			char inChar = str.charAt(i);
			toReverse.push(inChar);
			Thread.sleep(1000);
			System.out.println(toReverse);	
			
		}

		
		String newStr = "";
		while(!toReverse.isEmpty()) {
			newStr += toReverse.pop();
		}
		Thread.sleep(1000);
		System.out.println(newStr);
		return newStr;
		
	}
	
	
	public static String ReverseString3(String str) {
		String reversedString = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			char inChar = str.charAt(i);
			reversedString += inChar;
			System.out.println(inChar);
		}
		
		System.out.println(reversedString);
		return reversedString;
		
	}
	

}
