package random_challenges;

import java.util.ArrayList;
import java.util.Collections;


public class MaximumSubArr {

	public static void main(String[] args) {
		
	int[] a1 = {34,-50,42,14,-5,86};
	
	int[] a2 = {-5,-1,-8,-9};
	
	System.out.println(getMaximumSubSum3(a1));

	System.out.println(getMaximumSubSum(a2));
	}
	
	
	public static int getMaximumSubSum(int[] array) {
		ArrayList<Integer> sums = getSums(array);
//		int max = Integer.MIN_VALUE;
//		
//		for(int a : sums) {
//			if(a > max) {
//				max = a;
//			}
//			if(max < 0) {
//				max = 0;
//			}
//		}
//		return max;
		int max  = Collections.max(sums);
		if(max <0) {
			max = 0;
		}
		return max;
	}
	
	
	public static ArrayList<Integer> getSums(int[] arr){
		ArrayList<Integer> sums = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
//			if(i == 0) {
//				for (int j = i; j < arr.length-1; j++) {
//					sum += arr[j];
//				}
//				sums.add(sum);
//				sum = 0;
//				
//			}
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
			}
			sums.add(sum);
			sum = 0;
					
		}
	
		System.out.println(sums);
		return sums;
	}
	
	
	// Clean way
	public static int getMaximumSubSum2(int[] array) {
		ArrayList<Integer> sums = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
		
			for (int j = i; j < array.length; j++) {
				sum += array[j];
			}
			sums.add(sum);
			sum = 0;
					
		}
		int max = Collections.max(sums);
		if(max > 0) {
			return max;
		}
	
		
		return sum;
	}
	
	
	// Clean way
		public static int getMaximumSubSum3(int[] array) {
			//ArrayList<Integer> sums = new ArrayList<Integer>();
			int temp = 0;
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
			
				for (int j = i; j < array.length; j++) {
					sum += array[j];
				}
			
				if(temp < sum) {
					temp = sum;
				}
				sum = 0;
						
			}
			if(temp < 0) {
				return sum;
			}
		
			
			return temp;
		}
		
		
	
	
	

}
