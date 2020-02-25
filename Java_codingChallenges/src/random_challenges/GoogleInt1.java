package random_challenges;

import java.util.ArrayList;





public class GoogleInt1 {

	
	//Given a number N. write a code to print all positive numbers less than N in which all adjacent digits differ by 1
	public static void main(String[] args) {
		calculateNumbers(105);
		
		
		

	}
	
	
	public static void calculateNumbers(int N) {

		ArrayList<Integer> result = new ArrayList<>();
		//HashMap<Integer,Integer> map = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			
			if(i<11) {
				result.add(i);
			}
			else if(isDifferByOne(i)) {
				
				result.add(i);
				
			}
			
		}
		System.out.println(result);
		
	}
	
	public static boolean isDifferByOne(int N) {
		String numString = String.valueOf(N);
		int len = numString.length();
		

	//System.out.println(numString.substring(0,1) + numString.substring(1));\
		int rul = Integer.parseInt(numString.substring(0,1)) - Integer.parseInt(numString.substring(1));
		if(rul == 1 || rul == -1) {
			return true;
		}
	System.out.println(Integer.parseInt(numString.substring(0,1)) - Integer.parseInt(numString.substring(1)));

		
		
		
		return false;
	}

}
