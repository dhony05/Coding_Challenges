package random_challenges;

import java.util.Arrays;

public class LeastThreeInteger {

	public static void main(String[] args) {
		int[] arr = {-10,-10,5,2};
		
		System.out.println(leastTree(arr));
		
int[] arr2 = {-10,-10,5,20};
		
		System.out.println(leastTree(arr2));

	}

	public static int leastTree(int[] arr) {
		int currentMult = arr[0];
		int max = 0;
		int next = 0;
		int count = 0;
		if(arr.length ==3) {
		for (int i = 1; i < arr.length; i++) {
				currentMult *= arr[i];
				max = Math.max(currentMult, max);
			}
		}
		
	//Inconplete 
		return max;
	}
	

}
