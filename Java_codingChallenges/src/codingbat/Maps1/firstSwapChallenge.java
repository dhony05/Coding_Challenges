package codingbat.Maps1;

import java.util.LinkedHashMap;

public class firstSwapChallenge {

	public static void main(String[] args) {
		String[] arr = {"ax", "bx", "cx", "cy", "by", "ay", "aaa","by", "azz"};

		firstSwap(arr);
	}
	
	public static String[] firstSwap(String[] strings) {
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
//					
				  if(strings[j].startsWith(currentString.substring(0,1) )&& ((!map.containsKey(strings[j])))) {
				  
				  
					  map.put(currentString, i);
					
					//swapping
					//temp = strings[i];
					strings[i] = strings[j];
					strings[j] = currentString;
					break;
					}
 
			  }else if(map.containsKey(currentString)) {
					break;
					  
				}	  
			  
				
				else{
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
