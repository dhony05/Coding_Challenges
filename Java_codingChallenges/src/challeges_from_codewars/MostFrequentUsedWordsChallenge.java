package challeges_from_codewars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MostFrequentUsedWordsChallenge {

	public static void main(String[] args) {
		System.out.println(top3("wont won't won't"));
		System.out.println(top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
		System.out.println(top3("In a village of La Mancha, the name of which I have no desire to call to mind, there lived not long since one of those gentlemen that keep a lancein the lance-rack, an old buckler, a lean hack, and a greyhound forcoursing. An olla of rather more beef than mutton, a salad on mostnights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extraon Sundays, made away with three-quarters of his income."));
		System.out.println(top3("time, is the best time, in the life because life is life plus life"));
	}
	
	 public static List<String> top3(String s) {
		 List<String> filteredWords = new ArrayList<String>();
	        String[] words = s.replace(",", "")
	        		.replace(".", "")
	        		.replace(":", "")
	        		.replace(";", "")
	        		.replace("?", "")
	        		.replace("!", "")
	        		
	        		.toLowerCase()
	        		.split(" ");
	        if(words.length == 0) {
	        	return filteredWords;
	        }
	        Map<String,Integer> map = new TreeMap<String,Integer>();
	         for(String str : words) {
	        	 if(!str.equals(" ")&& !map.containsKey(str)) {
	        		 map.put(str, 1);
	        	 }else {
	        		 map.put(str,map.get(str)+1); 
	        	 }
	         }
	         //Sort the map in a reverse order
//	         Map<String, Integer> sortedMap = map.entrySet().stream()
//                     .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
//                     .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//	         System.out.println(sortedMap);
	         
	         for(String str : map.keySet()) {

	        		 filteredWords.add(str);
//	                if(sortedMap.get(str) == 4){
//	                  
//	                 
//	                  System.out.println(str + "here");
//	                }

	         }
	         
	         if(filteredWords.size()>=3) {
	        	 return filteredWords.subList(0, 3);
	         }
	         
	         
	        return filteredWords;
	    }

}
