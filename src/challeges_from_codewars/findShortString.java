package challeges_from_codewars;

public class findShortString {
	
	/*
	 * Simple, given a string of words, return the length of the shortest word(s).
	 *String will never be empty and you do not need to account for different data types.
	 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//findShort("The error is mine");
		//findShort("I am very happy");
		//findShort("Nobod sdsdsds  sdsdsd sdsd sdsds ds");
		findShort("Porter likes to eat mangu");

	}
	
	public static int findShort(String s) {
		
		String word = "";
		String newS[] =  s.split(" ");
		int short_word = newS[0].length();
		for(int i = 0; i<newS.length; i++){
			if(newS[i].length() <= short_word){
				short_word = newS[i].length();
				word = newS[i];
			}

		}
	
		System.out.println("The length is: " + short_word);
		System.out.println("The word is: " + word);
		return short_word;
		
	}

}
