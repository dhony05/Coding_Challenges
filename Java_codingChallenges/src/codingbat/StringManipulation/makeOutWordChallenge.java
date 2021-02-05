package codingbat.StringManipulation;

public class makeOutWordChallenge {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.


makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
	 * @param out
	 * @param word
	 * @return
	 */
	
	public String makeOutWord(String out, String word) {
		  int len = out.length();
		  return out.substring(0,(len)/2) + word + out.substring(len/2,len);
		}


}
