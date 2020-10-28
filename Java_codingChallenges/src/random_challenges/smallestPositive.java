package random_challenges;

import java.util.Arrays;

public class smallestPositive {

	
	
	public static void main(String[] args) {
		solution(new int[] {1,3,6,4,1,2});
	}

	private static int solution(int[] A) {
		
		int solution = 0;
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			if((A[i]+1> 0) && !Arrays.asList(A).contains(A[i]+1)){ 
				
				solution = A[i]+1;
				break;
			}
		}
		System.out.println(solution);
		return solution;
		
		// need a solution 
	}
}
