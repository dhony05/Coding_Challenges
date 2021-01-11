package random_challenges;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(areAnagram("hello","olhel"));
		System.out.println(areAnagram("hell3","olhel"));
		System.out.println(areAnagram("hello","olhellooo"));
		System.out.println(areAnagram("h%$lo","h$@lo"));
		System.out.println(areAnagram("como","moco"));
	}
	
	public static boolean areAnagram(String a, String b) {
		
		HashMap<Character,Integer> word = new HashMap<>();
		// create a map to populate the letters 
		int count = 0;
		if((a.length()> b.length())||(a.length()< b.length())){
		// check for nor equal size
			// if not equal means not anagram
			return false;
		}
		for(int i =0;i< a.length();i++) {
			//for loop to populate the map
		     if(!word.containsKey(a.charAt(i)) ) {
		    	 count  = 1;
		    	 word.put(a.charAt(i), count);
		     }else {
		    	count = word.get(a.charAt(i));
		    	count ++;
		    	word.put(a.charAt(i), count);
		    	 
		     }

		}
		System.out.println(word);
		
		
		for(int i= 0 ;i< b.length();i++) {
			//for loop to eliminate the letter if is found
			if(word.containsKey(b.charAt(i))) {
				//if we find the letter we decrease its value 
				count = word.get(b.charAt(i));
				count --;
				word.put(b.charAt(i), count);
				if(count == 0) {
			//if the value goes to 0 we delete the letter from the map
					word.remove(b.charAt(i),count);
					System.out.println(word);
				}
				
			}
			
		}
		// if the map is empty means there is anagram
		if(word.isEmpty()) {
			return true;
		}
		
		
		return false;
		
		
		
	}

}
