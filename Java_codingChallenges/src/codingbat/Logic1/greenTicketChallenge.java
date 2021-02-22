package codingbat.Logic1;

import java.util.Random;

public class greenTicketChallenge {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(10);
		int n2 = rand.nextInt(10);
		int n3 = rand.nextInt(10);
		System.out.println(n+ " "+n2+" "+ n3);
		System.out.println(greenTicket(n, n2, n3));

	}
	
	/**
	 * 
	 * link:https://codingbat.com/prob/p120633
	 * You have a green lottery ticket, with ints a, b, and c on it. 
	 * If the numbers are all different from each other, the result is 0. 
	 * If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.


greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static  int greenTicket(int a, int b, int c) {
		  boolean same  = ((a== b) &&( a==c));
		  if(((a != b)&&(a==c))||((a == b)&&(a!=c))||((c == b)&&(a!=c))){
		    return 10;
		  }else if (same){
		    return 20;
		  }
		  return 0;
		}


}
