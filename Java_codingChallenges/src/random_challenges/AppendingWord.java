package random_challenges;

import java.util.HashMap;
import java.util.Map;

public class AppendingWord {

	/***
	 * 
	 *Loop over the given array of strings to build a result string like this: 
	 *when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string
	 * to the result. Return the empty string if no string appears a 2nd time.

	wordAppend(["a", "b", "a"]) → "a"
	wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
	wordAppend(["a", "", "a"]) → "a"
	 */
	public static void main(String[] args) {
		String[] arr = {"a", "b", "a","b","c", "a", "z","a"};
		System.out.println(wordAppend(arr));

	}
	
	
	public static String wordAppend(String[] strings) {
		  Map<String,Integer> map = new HashMap<String,Integer>();
		  String result = "";
		  for(String s: strings){
		    if(!map.containsKey(s)){
		      map.put(s,1);
		    }else{
		      map.put(s,map.get(s) +1);
		      if(map.get(s)%2 == 0){
		        result += s;
		      }
		    }
		  }
		  return result;
		}


}
