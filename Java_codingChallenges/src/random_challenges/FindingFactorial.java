package random_challenges;

public class FindingFactorial {

	public static void main(String[] args) {
		 SearchFactorial(5);
		 SearchFactorial(1);
		 SearchFactorial(0);
		 System.out.println(SearchFact(5));

	}
	
	public static int SearchFactorial(int number) {
		int result = 1;
		for(int i = number; i>0;i--) {
			result *= i;
			
		}
		System.out.println(result);
		return result;
		
	}
	
	
	/// adding recursion to it
	
	public static int SearchFact(int number) {
		if (number <= 1){
			return 1;
		}
		
		else {
			return number * SearchFact(number-1);
		}
	}

}
