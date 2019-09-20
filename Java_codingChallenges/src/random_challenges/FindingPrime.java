package random_challenges;

public class FindingPrime {

	public static void main(String[] args) {
	  searchPrime(7);
	  searchPrime(6);

	}

	public static void searchPrime(int input) {
		boolean isPrime = false; int  time=0;
		for(int i= 2; i< input; i++,time++) {
			if(input%i == 0) {
				isPrime = false;
				break;
				
			}
			isPrime = true;
		}
		
		if(isPrime) {
			System.out.println(input + " is a prime.");
		}
		else {
			System.out.println(input + " is not a prime.");
		}
	}

}
