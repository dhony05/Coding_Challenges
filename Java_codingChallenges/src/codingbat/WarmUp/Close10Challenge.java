package codingbat.WarmUp;

public class Close10Challenge {

	/***
	 * 
	 * url:https://codingbat.com/prob/p172021
	 * 
	 * 
Given 2 int values, return whichever value is nearest to the value 10,
 or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0

	 * @param a
	 * @param b
	 * @return
	 */
	public int close10(int a, int b) {
		  int absoluteA= Math.abs(a-10);
		  int absoluteB = Math.abs(b-10);
		  if( absoluteA == absoluteB ){
		    return 0;
		  }
		 
		  return  (a< b)? a: b ;
		}

}
