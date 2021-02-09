package codingbat.Logic1;

public class love6Challenge {

	public static void main(String[] args) {
		
		System.out.println(love6(-4, -10));
	}
	
	/**
	 * 
The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.


love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean love6(int a, int b) {
		  if(((a == 6)||(b==6)) ||( (a+b == 6)||(a-b == 6)||(b-a == 6))){
		    return true;
		  } 
		  return false;
		}


}
