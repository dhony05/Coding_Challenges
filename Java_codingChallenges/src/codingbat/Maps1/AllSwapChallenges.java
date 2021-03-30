package codingbat.Maps1;

import java.util.LinkedHashMap;
import java.util.Map;

public class AllSwapChallenges {

	public static void main(String[] args) {
		String[] arr = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
	
		allSwap(arr);
	}
	
	public static String[] allSwap(String[] strings) {
		  if(strings.length == 0){
		    return strings;
		  }
		  LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer,String>();
		  String temp = "";
//		  for(String s : strings){
//		    if(!map.containsKey(s)){
//		      map.put(s,s.substring(0,1));
//		    
//		    }
		  
		  for (int i = 0; i < strings.length; i++) {
			  if(!map.containsKey(strings[i].substring(0,1))){
				  map.put(i,strings[i]);
				  
				 
			  }
//		    
		
		}
		  
//		  for(String s: strings) {
//			  System.out.print(  s + ", ");
//		  }
		  
//		  for(int s : map.keySet()) {
//			  
//		  }
		   System.out.println(map);
		  return strings;
	}

}
