package random_challenges;

import java.util.HashMap;
import java.util.Map;

public class FirstCharChallenge {

	/***
	 * 
	 *
Given an array of non-empty strings, return a Map<String, String> with 
a key for every different first character seen, with the value of all the strings
 starting with that character appended together in the order they appear in the array.


firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
	 */
	
	public static void main(String[] args) {
		String[] str = {"salt", "tea", "soda", "toast"};
		System.out.println(firstChar(str));

	}
	
	
	public static  Map<String, String> firstChar(String[] strings) {
		  
		Map<String,String> map = new HashMap<String,String>();
		for(String s: strings) {
			if(!map.containsKey((s.substring(0,1)))) {
				map.put(s.substring(0,1), s);
			}else {
				String newS = map.get(s.substring(0,1)) + s;
				map.put(s.substring(0,1), newS);
			}
		}
		return map;
	}
	


}
