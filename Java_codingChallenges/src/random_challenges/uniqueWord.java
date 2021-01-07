package random_challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class uniqueWord {

	public static void main(String[] args) {
		String sentence = "Hello HELLO World WORLD hi";
		
		findUnique(sentence);

	}

	public static String findUnique(String sentence) {
		List<String> uniques = Arrays.asList(sentence.toLowerCase()).stream()
				.distinct()
				.collect(Collectors.toList());
		int count = 0;
		Map<String, Integer>uniqueCount = new HashMap <String,Integer>();
		
		for (int i = 0; i < sentence.split(" ").length; i++) {
			if(!(uniqueCount.containsKey(sentence.split(" ")[i]))) {
				uniqueCount.put(sentence.split(" ")[i], count);
			}else {
				count ++;
				uniqueCount.put(sentence.split(" ")[i], count);
			}
		}
		System.out.println(uniqueCount);
		System.out.println(uniques);
		
		
		return null;
	}

}
