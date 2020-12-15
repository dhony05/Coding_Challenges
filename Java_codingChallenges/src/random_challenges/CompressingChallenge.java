package random_challenges;

import java.util.LinkedHashMap;

public class CompressingChallenge {

	public static void main(String[] args) {
		String str = "wwwwaaaaabbbbzexxxxxx";
		
		compressString(str);
		compressString("weeeeeeeeeegbbbbbbbbrrrrr");
		System.out.println("-------------");
		System.out.println("Before the compression: \\\" wwwwaaaaabbbbzexxxrraaxxxbr \\\"   ");
		System.out.println("After the compression: "+ " \" "+ compressNonConsecutive("wwwwaaaaabbbbzexxxrraaxxxbr ")+ "\"");
		

	}

	
/***
 * This method take a string and compress it, if the letter repeats more than once is replace by the number of times it repeats
 * Only work when when a letter repeats periodically and consecutively for example "aaaaaabbbbbbcdeeeeee" no for aaaaabbbbbaaaccc
 * @param str
 * @return compressed String
 */
	private static String compressString(String str) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		StringBuilder sb = new StringBuilder();
		int track = 0;
		for(int i = 0; i< str.length(); i++) {
		 if(!map.containsKey(str.charAt(i))) {
			 track = 1 ;
				map.put(str.charAt(i),track );
			}else if(map.containsKey(str.charAt(i))) {
				track ++;
				map.put(str.charAt(i), track);
			}else {
				track = 0;
			}
		}
		
		
		
		for(char c: map.keySet()) {
				sb.append(c);
				sb.append(map.get(c));
		
		}
		
		System.out.println(sb.toString());
		System.out.println(map);
		
		return sb.toString();
		
	}
	
	public static String compressNonConsecutive( String str) {
		
		StringBuilder sb = new StringBuilder();
		int repeats = 0;
		for (int i = 0; i < str.length(); i++) {
			repeats = 1;
			sb.append(str.charAt(i));
			
			while(repeats != 0 && i != str.length()-1) {
				if(str.charAt(i) == str.charAt(i+1)) {
					repeats ++;			
					i++;	
				}else {	
					if(repeats>1)
					sb.append(repeats);
					repeats = 0;
					
				}			
			}
			
		}
		
		
		return sb.toString();
	}
	

}
