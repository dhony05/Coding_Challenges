package random_challenges;

import java.util.ArrayList;





public class GoogleInt1 {

	
	//Given a number N. write a code to print all positive numbers less than N in which all adjacent digits differ by 1
	public static void main(String[] args) {
		calculateNumbers(105);
		
		calculateNumbers(140);
		
		
		

	}
	
	
	public static void calculateNumbers(int N) {

		ArrayList<Integer> result = new ArrayList<>();
		
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
	/***
	 * This method checks whether the number entered as input all its adjacent digits differ by 1 or not.
	 * @param N
	 * @return true if all the adjacent digits differ by 1.
	 */
	public static boolean isDifferByOne(int N) {
		String numString = String.valueOf(N);
		int len = numString.length();	
		int factor = (int) Math.pow(10, len-1);
		int rul = ((N/factor) - (N%factor));

		//System.out.println(N/factor);
		
		if(rul == 1 || rul == -1) {
			return true;
		}
		
		if(len>=2) {
			int num = 0;
			int tempN = N;
			int tempFactor = factor;
			int subst = 0;
//			System.out.println("Whole number: " +tempN);
			for (int i = 0; i < len; i++) {
	
				tempFactor = (int) Math.pow(10, len-(i+1));
				num = tempN/tempFactor;
				if(num == 0) {
					subst = subst * (-1);
				}
				subst = num - subst ;
//				System.out.println(" inside arr: " + num[i]);
//				System.out.println("tempN" + tempN);
				tempN = tempN%tempFactor;
//				System.out.println("tempFactor " + tempFactor);
				
				
				
			}
			//System.out.println("substraction: " +subst);
			if(subst == 1 || subst == -1) {
				return true;
			}
			
		}
//	System.out.println(Integer.parseInt(numString.substring(0,1)) - Integer.parseInt(numString.substring(1)));
	
		
		return false;
	}

}
