package random_challenges;

public class Fibonacci {

	public static void main(String[] args) {
		

		
	 System.out.println("fib" +fib(4));

	
	 
	 
	}
	

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n <= 1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}

}
