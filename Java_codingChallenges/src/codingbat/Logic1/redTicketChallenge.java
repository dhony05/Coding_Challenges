package codingbat.Logic1;

import java.util.Random;

public class redTicketChallenge {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(10);
		int n2 = rand.nextInt(10);
		int n3 = rand.nextInt(10);
		System.out.println(n+ " "+n2+" "+ n3);
		System.out.println(redTicket(n, n2, n3));
	}
	
	
	/**
	 * link:https://codingbat.com/prob/p170833
	 * You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.


redTicket(2, 2, 2) → 10
redTicket(2, 2, 1) → 0
redTicket(0, 0, 0) → 5
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int redTicket(int a, int b, int c) {
		  boolean same = ((a == b)&&(a== c));
		   if(same){
		     if(a==2){
		       return 10;
		     }
		     return 5;
		   }else if((b != a)&&(c != a)){
		     return 1;
		   }
		   return 0;
		}

}



