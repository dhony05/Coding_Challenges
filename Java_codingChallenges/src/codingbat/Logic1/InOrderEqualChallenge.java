package codingbat.Logic1;

public class InOrderEqualChallenge {

	public static void main(String[] args) {
		System.out.println(inOrderEqual(5, 5, 7, true));

	}
	
	/**
	 * link:https://codingbat.com/prob/p140272
Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.


inOrderEqual(2, 5, 11, false) → true
inOrderEqual(5, 7, 6, false) → false
inOrderEqual(5, 5, 7, true) → true
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param equalOk
	 * @return
	 */
	public static  boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		  if(equalOk){
		    return (
		      ((a==b)&&(b<c))
		    ||((b>a)&&(b==c))
		    ||((a==b)&&(a==c))
		    );
		  }
		  return ((a<b)&&(b<c));
		  
		  
		}


}
