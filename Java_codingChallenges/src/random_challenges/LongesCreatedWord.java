package random_challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongesCreatedWord {

	public static void main(String[] args) {
		String[] arrWords = {"to","toe","toes","do","co","does","po","panama"};
		ArrayList<String> words =  new ArrayList<>(Arrays.asList(arrWords));
		System.out.println(longestWord("tsgedo",words));// toes,does
		
		
		String[] arrWords2 = {"cul","taka","culi","takata","tara","f","pata","puli"};
		ArrayList<String> words2 =  new ArrayList<>(Arrays.asList(arrWords2));

		System.out.println(longestWord("tcautlika",words2));
	}
	
	/***
	 * Takes a String and a dictionary  and create a set of words(Strings)
	 *  that can be created from the input String
	 * @param letters
	 * @param dict
	 * @return
	 */
	public static Set<String>longestWord(String letters,ArrayList<String> dict){
		Set <String> result = new HashSet<String>();
		int max = 0;
		
		for(String s: dict) {
			if(isCreated(letters,s)) {
				result.add(s);
				if(s.length()>max) {
					max = s.length();
				}
				
			}
			
		}
		int MAX_LEN = max;
		System.out.println(MAX_LEN);
		return result.stream().
				filter(word ->  word.length() == MAX_LEN )
				.collect(Collectors.toSet());
		
	}
	
	/***
	 * A helper method that will check if a word can be created from the inputWords
	 * @param letters
	 * @param dString
	 * @return a boolean
	 */
	public static boolean isCreated(String letters, String dString) {
		int count = 0;
		HashMap<Character,Integer> dStringMap = new HashMap<Character,Integer>();
		dStringMap.clear();
		for (int i = 0; i < dString.length(); i++) {
			if(!dStringMap.containsKey(dString.charAt(i))) {
				count = 1;
				dStringMap.put(dString.charAt(i), count);
			}else {
				count = dStringMap.get(dString.charAt(i));
				count ++;
				dStringMap.put(dString.charAt(i), count);
			}
		}
		
		for(int i =0; i<letters.length();i++) {
			
			if(dStringMap.containsKey(letters.charAt(i))){
				count = dStringMap.get(letters.charAt(i));
				count --;
				if(count == 0) {
					
					dStringMap.remove(letters.charAt(i));
				}else {
					dStringMap.put(letters.charAt(i), count);
				}

			}
			if(dStringMap.isEmpty()) {
				return true;
			}
			
		}
		return false;
		
		
	}

}
