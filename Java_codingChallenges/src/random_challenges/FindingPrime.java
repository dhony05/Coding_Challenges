package random_challenges;

public class FindingPrime {

	public static void main(String[] args) {
	  searchPrime(7);
	  searchPrime(3);
	  searchPrime(2);
	  searchPrime(5);
	  searchPrime(11);
	  searchPrime(17);
	  searchPrime(23);
	  
	  

	}

	public static void searchPrime(int input) {
		boolean isPrime = true; int  time=0;
		if(input <=1) {
			isPrime = false;
		}
		for(int i=2; i< Math.sqrt(input); i++,time++) {
			if(input%i == 0) {
				System.out.println(input );
				isPrime = false;
				break;
				
			}
		}
		
		if(isPrime) {
			System.out.println(input + " is a prime.");
		}
		else {
			System.out.println(input + " is not a prime.");
		}
	}

}