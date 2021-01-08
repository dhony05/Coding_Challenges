package random_challenges;

import java.util.ArrayList;

public class BreakingStrings {

	public static void main(String[] args) {
		
		
		String str = "the quick brown fox jumps over the lazy dog";
		ArrayList<String> solution = breakString(str,10);
		System.out.println(solution);
		
		

	}
	
	public static ArrayList<String> breakString(String str , int k) {
		String[] words = str.split(" ");
		ArrayList<String> posibleWords = new ArrayList<String>();
		String currentLine = "";
		
		for(String word:words) {
			System.out.println();
			
			
			
		    if(word.length() > k) {
		    	return null;
		    	
		    }else if(currentLine.length()+ word.length()>k){
		    	posibleWords.add(currentLine);
		    	currentLine = word;
		    	
		    	
		    }else {
		    	if(currentLine != "") {
		    	currentLine += " "+ word;
		    	}else {
		    		currentLine = word;
		    	}
		    }
			
			
			
		}
		if(currentLine != "") {
			posibleWords.add(currentLine);
			
		}
		return posibleWords;
	}

}
