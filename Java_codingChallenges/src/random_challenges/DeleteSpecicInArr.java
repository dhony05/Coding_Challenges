package random_challenges;

import java.util.Arrays;

public class DeleteSpecicInArr {

	public static void main(String[] args) {
		int[] arr = {2,4,5,6,8,10};
		
//		System.out.println(Arrays.asList(delitingSpecific(arr,1)));
		
		
		for (int i : arr) {
			System.out.print(i);
		}
		
		System.out.println("\n-------------");
		for (int i : delitingSpecific(arr,3)) {
			System.out.print(i);
		}
//		swap(1,2);
	}
	
	
	
	public static void swap(int[] arr, int a , int b) {
	    arr[a] = arr[a]+arr[b];
	    arr[b] = arr[a] - arr[b];
	    arr[a] = arr[a] - arr[b]; 
	    //System.out.println("a : "+ a + " b : "+ b);
	}
	
	public static int[] delitingSpecific(int[] arr, int position) {
		for (int i = 0; i < arr.length-1; i++) {
			if(i ==  position) {
				swap(arr,i,i+1);
				position ++;

			}
		}
		
		return arr;
		
	}

}
