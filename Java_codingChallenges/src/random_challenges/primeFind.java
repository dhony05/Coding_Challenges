package random_challenges;

import java.util.ArrayList;

public class primeFind {

	static long[] firstPrimes  = {2,3,5,7};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findNthPrime(1));
	}
	
	public static long findNthPrime(long nth) {
		ArrayList<Long> primes = new ArrayList<>();
		
		for(long a : firstPrimes) {
			primes.add(a);
		}
		if(nth > 3) {
			for(long  i = 2; primes.size()<=nth ; i++) {
				if((i%2 !=0)&&(i%3 !=0)&&(i%5 !=0)&&(i%7 !=0)) {
				primes.add(i);
				}
			}
		}
		
		System.out.println(primes.size());
		return primes.get((int) nth-1);
	}

}
