package random_challenges;

public class CreateBS {

	public static void main(String[] args) {
		
		int[] arr = {1,45,76,86,89,98,133,204,555};
		
		System.out.println(binarySearch(arr,86));

	}
	
	public static int binarySearch(int[] arr , int target) {
		int begining = 0; int ending  = arr.length-1; int middle;
		
		while(begining <= ending) {
			middle = (begining+ending)/2;
			
			if(target > arr[middle]) {
				begining = middle + 1;
			}
			else if(target < arr[middle]) {
				ending = middle - 1;
			}
			
			else {
				return middle;
			}
			
			
		}
		return -1;
	}

}
