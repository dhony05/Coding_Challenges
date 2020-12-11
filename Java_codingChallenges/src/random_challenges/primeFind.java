package random_challenges;

import java.util.ArrayList;

public class primeFind {

	static long[] firstPrimes  = {2,3,5,7};
	public static void main(String[] args) {
		

		System.out.println(findNthPrime(50));
	}
	
	public static long findNthPrime(long nth) {
		ArrayList<Long> primes = new ArrayList<>();
		
		for(long a : firstPrimes) {
			primes.add(a);
		}
		if(nth > 3) {
			int count =0;
			for(long  i = firstPrimes[3]; primes.size()<=nth ; i++ ) {
				if((i%2 !=0)&&(i%3 !=0)&&(i%5 !=0)&&(i%7 !=0)) {
				primes.add(i);
				}
			}
		}
		
		System.out.println("Size: " + primes.size());
		return primes.get((int) nth-1);
	}

}
