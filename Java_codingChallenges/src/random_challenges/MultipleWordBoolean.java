package random_challenges;

import java.util.HashMap;
import java.util.Map;

public class MultipleWordBoolean {

	/***
	 * 
	 * Given an array of strings, return a Map<String, Boolean> where each different string
	 *  is a key and its value is true if that string appears 2 or more times in the array.


wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 */
	public static void main(String[] args) {
		String[] arr = {"a", "b", "a", "c", "b"};

		System.out.println(wordMultiple(arr));
	}
	public static  Map<String, Boolean> wordMultiple(String[] strings) {
		  Map<String,Boolean> map = new HashMap<String,Boolean>();
		  for(String s : strings){
		    if(!map.containsKey(s)){
		      map.put(s,false);
		    }else{
		      map.put(s,true);
		    }
		  }
		  return map;
		}


}
