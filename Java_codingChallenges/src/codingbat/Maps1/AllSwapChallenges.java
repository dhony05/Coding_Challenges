package codingbat.Maps1;

import java.util.LinkedHashMap;


public class AllSwapChallenges {

	public static void main(String[] args) {
		String[] arr = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
	
		allSwap(arr);
	}
	
	public static String[] allSwap(String[] strings) {
		  if(strings.length == 0){
		    return strings;
		  }
		  String temp = "";
		  LinkedHashMap<String, Integer> map = new LinkedHashMap<String,Integer>();
		  for (int i = 0; i < strings.length; i++) {
			  temp = strings[i].substring(0,1);
			  for (int j = i+1; j < strings.length; j++) {
				if(!map.containsKey(strings[i])) {
					//create a container map
				  if(strings[j].startsWith(temp)) {
					map.put(strings[i], i);
					
					//swapping
					temp = strings[i];
					strings[i] = strings[j];
					strings[j] = temp;
					break;
					}
				}else {
					 map.remove(strings[j]);
					 break;
				}
			}
			  
			
		}
		  for (String string : strings) {
				System.out.print(string + ", ");
			}
			
		  return strings;
	}

}
