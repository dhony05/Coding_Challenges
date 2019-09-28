package random_challenges;

public class FindingFactorial {

	public static void main(String[] args) {
		 SearchFactorial(5);
		 SearchFactorial(1);
		 SearchFactorial(0);
		 SearchFactorial(7);

	}
	
	public static int SearchFactorial(int number) {
		int result = 1;
		for(int i = number; i>0;i--) {
			result *= i;
			
		}
		System.out.println(result);
		return result;
		
	}

}
