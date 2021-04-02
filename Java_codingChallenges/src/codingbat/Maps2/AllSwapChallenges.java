package codingbat.Maps2;

import java.util.LinkedHashMap;


public class AllSwapChallenges {
	
	/***
	 * url:https://codingbat.com/prob/p134133
	 * 
We'll say that 2 strings "match" if they are non-empty and
 their first chars are the same. Loop over and then return the given array
  of non-empty strings as follows: if a string matches an earlier string in the array, 
  swap the 2 strings in the array. When a position in the array has been swapped, it no longer
   matches anything. Using a map, this can be solved making just one pass over the array.
    More difficult than it looks.


allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
	 * @param args
	 */

	public static void main(String[] args) {
		String[] arr = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
	
		allSwap(arr);
	}
	
	public static String[] allSwap(String[] strings) {
		  if(strings.length == 0){
		    return strings;
		  }
		  String currentString = "";
		  LinkedHashMap<String, Integer> map = new LinkedHashMap<String,Integer>();
		  for (int i = 0; i < strings.length; i++) {
			  // hold the current string
			  currentString = strings[i] ;
			  for (int j = i+1; j < strings.length; j++) {
				if(!map.containsKey(currentString)) {
					//create a container map
				  if(strings[j].startsWith(currentString.substring(0,1))) {
					map.put(currentString, i);
					
					//swapping
					//temp = strings[i];
					strings[i] = strings[j];
					strings[j] = currentString;
					break;
					}
				}else {
					 map.remove(strings[j]);
					 break;
				}
			}
			  
			
		}
		  System.out.println(map );
		  for (String string : strings) {
				System.out.print(string + ", ");
			}
			
		  return strings;
	}

}
