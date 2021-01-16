package random_challenges;

import java.util.HashMap;
import java.util.Map;

public class countDifferentWord {

	/**
	 * Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, 
	 * always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later,
	 * but for this problem the value is simply 0.


word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strings = {"h","e","l","l","o"};
		System.out.println(word0(strings));

	}

	public static Map<String,Integer> word0(String[] strings) {
		Map<String,Integer> myMap = new HashMap<String,Integer>();
		
		for(String s : strings) {
			if(!myMap.containsKey(s)) {
				myMap.put(s, 0);
			}
		}
		return myMap;
	}

}
