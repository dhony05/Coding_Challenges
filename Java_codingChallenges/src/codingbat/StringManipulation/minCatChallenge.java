package codingbat.StringManipulation;

public class minCatChallenge {

	/***
	 * 
Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(minCat("java", "Hello"));
		System.out.println(minCat("java", "Hello"));
	}
	public static String minCat(String a, String b) {

		  String newStr= "";
		  int aLen = a.length();
		  int bLen = b.length();
		  
		  int min = Math.min(aLen,bLen);
		   if(aLen == bLen){
		    newStr = a+b;
		    return newStr;
		   }
		   newStr = a.substring(aLen-min,aLen) +  b.substring(bLen-min,bLen);
		   return newStr;
		   
		   
		   
		   
		}


}
