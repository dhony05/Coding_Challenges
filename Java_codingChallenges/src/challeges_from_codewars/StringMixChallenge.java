package challeges_from_codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class StringMixChallenge {
	static String encode ="";
	
	static List<String> sameLen;
	
	public static void main(String[] args) {
		String s1="Are the kids at home? aaaaa fffff";
		String s2="Yes they are here! aaaaa fffff";
		mix(s1, s2);
		
		String s3 = "my&friend&Paul has heavy hats! &";
		String	s4 = "my friend John has many many friends &";
			
			//mix(s3, s4);
		
		
	}
	
	public static String mix(String s1, String s2) {
	      // your code
		Map<Character, Integer> s1Map = new HashMap<Character, Integer>();
		Map<Character, Integer> s2Map = new HashMap<Character, Integer>();
		
	    for(char c : s1
	    		.replaceAll("[^a-zA-Z0-9]", " ")
	    		.replace(" ", "")
//	    		.toLowerCase()
	    		.toCharArray()) {
	    	if(s1Map.containsKey(c)) {
	    		s1Map.put(c, s1Map.get(c) + 1);
	    	}else {
	    		s1Map.put(c, 1);
	    	}
	    	
	    }
	    
	   
	    for(char c : s2
	    		.replaceAll("[^a-zA-Z0-9]", " ")
	    		.replace(" ", "")
//	    		.toLowerCase()
	    		.toCharArray()) {
	    	if(s2Map.containsKey(c)) {
    		s2Map.put(c, s2Map.get(c) + 1);
	    	}else {
	    		s2Map.put(c, 1);
	    	}
	    }
	    
	    
	    
	    s1Map = sortMapByValue(s1Map);
	    s2Map = sortMapByValue(s2Map);
//	    
	    System.out.println(s1Map);
	    System.out.println(s2Map);
	    if(s1Map.size()< s2Map.size()) {	
	    	for(char c : s1Map.keySet()) {
	    		Modifier(s1Map, s2Map, c);
	    		
	    	}
	    }else {
	    	for(char c : s2Map.keySet()) {
	    		Modifier(s2Map, s1Map, c);
	    	}
	    }
		sameLen =  Arrays.asList(encode.split("/"));
//		System.out.println(sameLen);
//		System.out.println(encode);
//		
		
		return formatSameLen(sameLen);
	}
	
	public static List<String> Modifier(Map<Character,Integer> map2, Map<Character,Integer> map1, char c) {

		 sameLen = new ArrayList<String>();
		
		if(map1.containsKey(c)&& map2.containsKey(c)) {
			System.out.println(c);
			int value1 = map1.get(c);
			int value2 = map2.get(c);
			if((value1>value2)&&(value1>1)) {
				encode += "1:"+ c + value1+ "/"  ;
			
				sameLen.add("1:"+ c + value1);
				
			}else if((value2>value1)&&(value2>1)) {
				encode += "2:"+ c + value2 + "/" ;
				sameLen.add("2:"+ c + value2);
				
			}else if( value1 == value2 &&(value2>1)) {
				encode += "=:"+ c + value1 + "/";
				sameLen.add("=:"+ c + value1);
			}else {
				
			}
		}
		else if ((!map1.containsKey(c))&& (map2.containsKey(c) &&( map2.get(c) >1))){
			encode += "2:"+ c + map2.get(c) + "/"  ;
			sameLen.add("2:"+ c + map2.get(c));
		}
		if ((map1.containsKey(c))&& (!map2.containsKey(c) &&( map1.get(c) >1))){
			encode += "1:"+ c + map1.get(c) + "/"  ;
			sameLen.add("2:"+ c + map2.get(c));
		}

		return sameLen;
	}
	
	public static Map<Character,Integer> sortMapByValue(Map<Character,Integer> sMap){
		 Map<Character, Integer> sortedMap = sMap.entrySet().stream()
                 .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
                 .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		 return sortedMap;
	}
	
	// next step lexical
	
	public static String formatSameLen (List<String> lst) {
		System.out.println(lst);
		int fLen = lst.get(0).length();
		int counter  =  Integer.valueOf(fLen-1);
		for (int i = 0; i < lst.size()-1; i++) {
			if(lst.get(0).startsWith(counter));
			
		}
		
		// format and sort
		
		
		return encode;
		
		
	}
	

}
