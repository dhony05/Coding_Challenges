package random_challenges;

import java.util.Scanner;

public class ShortesDistance {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		
		String[] words = sentence.split(" ");
		
		String wordBeg = sc.nextLine();
		String wordEnd = sc.nextLine();
		
		System.out.println("Sentence: "+ sentence);
		
		System.out.println("Word1: " + wordBeg);
		System.out.println("Word2: " + wordEnd);
		
		
		System.out.println(getDistance(words,wordBeg,wordEnd));
		
	}
	
	public static String getDistance(String[] sentence,String word1,String word2) {
		double startWord = 0.0;
		double endWord = 0.0;
		double countBetween = 0.0;
		//if len is even
		if(isEven(word1.length())) { 
			startWord = (word1.length()/2) -0.5 ;
		}
		else {
			startWord = (word1.length()/2);
		}
		
		if(isEven(word2.length())) { 
			endWord = (word2.length()/2) +0.5;
		}
		else {
			endWord = (word2.length()/2)+1;
		}
		double currentWord = startWord;
			
		for (String word: sentence) {
			 if(word.equals(word1)){
				countBetween ++;	
			}
			 else if (( countBetween > 0) &&(!word.equals(word2))){
				 currentWord += word.length();
				 countBetween ++;
				}
			
			else if (word.equals(word2)) {
				currentWord += endWord + countBetween ;
			} 	
		}
		String result =  String.valueOf(currentWord);
		if(result.charAt(result.length()-1) == '0') {
			return result.replace(".0", "")+"d";
		}
			
		
		return currentWord+"d";
	}
	public static boolean isEven(int len) {
		if(len%2 == 0) {
			return true;
		}
		return false;
	}

}
