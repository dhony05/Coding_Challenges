package codingbat.Logic1;

import java.util.Random;

public class blueTicketChallenge {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(20);
		int n2 = rand.nextInt(20);
		int n3 = rand.nextInt(20);
		System.out.println(n+ " "+n2+" "+ n3);
		System.out.println(blueTicket(n, n2, n3));

	}
	
	/***
	 * link:https://codingbat.com/prob/p192267
You have a blue lottery ticket, with ints a, b, and c on it. 
This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair.
 If any pair sums to exactly 10, the result is 10. 
 Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. 
 Otherwise the result is 0.


blueTicket(9, 1, 0) → 10
blueTicket(9, 2, 0) → 0
blueTicket(6, 1, 4) → 10
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int blueTicket(int a, int b, int c) {
		  int ab = a+b;
		  int ac = a+c;
		  int bc = b+c;
		  if((ab == 10)||(ac == 10)||(bc == 10)){
		    return 10;
		  } else if (((ab-bc) == 10)||((ab-ac) == 10)){
		    return 5;
		  }

		  return 0;
		}


}
