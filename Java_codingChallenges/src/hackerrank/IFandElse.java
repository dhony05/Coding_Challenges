package hackerrank;


/***
 * Given an integer, n , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20 , print Weird
If n is even and greater than 20, print Not Weird
 * @author donelysfamilia
 * @return 
 *
 */
public class IFandElse {
	
	public static void main(String[] args) {
		iFandElse(24);
	}

	public static void iFandElse(int input) {
		
		if(input%2 == 1) {
			System.out.println("Weird");
		}else if((input%2 == 0)&& ((input >= 2)||(input <=5))) {
			System.out.println("Not Weird");
		}else if(((input%2 == 0)&& ((input >= 6)||(input <=20)))) {
			System.out.println("Weird");
		}else if(((input%2 == 0)&& (input > 20))) {
			System.out.println("Not Weird");
		}
		
	}
	 

}
