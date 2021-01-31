package codingbat.StringManipulation;

public class nTwiceChallenge {

	/***
	 * Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.


nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
	 * @param args
	 */
	
	
	/***
	 * Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.


twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"
	 * @param args
	 */
	
	/**
	 * 
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(nTwice("Chocolate", 3));

		System.out.println(twoChar("java", 2));
		System.out.println(middleThree("solving"));
	}
	
	
	public static String middleThree(String str) {
		  int halfLen = str.length()/2;
		  if(str.length() == 3){
		    return str;
		  }
		  return str.substring(halfLen-1,halfLen+2);
		}


	public static  String nTwice(String str, int n) {
		  String result = str.substring(0,n) + str.substring(str.length()-n);
		  return  result;
		}
	
	public static String twoChar(String str, int index) {
		  if((index<=0)||(index>=str.length())||(index+2>str.length())){
		    index = 0;
		  }
		   return str.substring(index,index+2);
		  
		}


}
