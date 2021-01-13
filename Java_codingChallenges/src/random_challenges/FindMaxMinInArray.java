package random_challenges;

public class FindMaxMinInArray {

	public static void main(String[] args) {
		int[] arr = {5,4,3,28,10,5,45};
		System.out.println("Maximun number in array: "+ getMax(arr));
		
		System.out.println("Minimun number in array: "+ getMin(arr));

	}
	
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int num: arr) {
			if(max<num) {
				max = num;
			}
		}
		return max;
	}
	
	public static int getMin(int[] arr) {
		int min = arr[0];
		for(int num: arr) {
			if(min>num) {
				min = num;
			}
		}
		return min;
	}
	
	

}
