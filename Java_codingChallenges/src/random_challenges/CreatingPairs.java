package random_challenges;

import java.util.HashMap;
import java.util.Map;

public class CreatingPairs {

	/**
	 * 
	 * 
Given an array of non-empty strings, create and return a Map<String,
 String> as follows: for each string add its first character as a key 
 with its last character as the value.


pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
	 */
	public static void main(String[] args) {
		String[] words = {"code", "bug","man", "moon", "main"};
		System.out.println(pairs(words));

	}

	private static Map<String,String> pairs(String[] words) {
		Map<String,String> wordsPairMap = new HashMap<String, String>();
		for(String s : words) {
			wordsPairMap.put(s.substring(0,1),s.substring(s.length()-1));
		}
		return wordsPairMap;
	}

}
