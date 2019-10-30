package challeges_from_codewars;

public class RowSumOddNumbers {
	
	//Given the triangle of consecutive odd numbers:
	//  1
   // 3     5
// 7     9    11
//13    15    17    19
//21    23    25    27    29
//...
	
	//Calculate the row sums of this triangle from the row index (starting at index 
	//rowSumOddNumbers(1); // 1
	//rowSumOddNumbers(2); // 3 + 5 = 8

	public static void main(String[] args) {
		

		System.out.println(rowSumOddNumbers(1)); // 1
		System.out.println(rowSumOddNumbers(2)); // 3 + 5 = 8
		System.out.println(rowSumOddNumbers(3));
		System.out.println(rowSumOddNumbers(4));
		//System.out.println(rowSumOddNumbers2(1));
		//System.out.println(rowSumOddNumbers2(2));
	}
	
	
	//first way to do it  O(n) time complexity
	
	public static int rowSumOddNumbers(int n) {
		// formula n*(n-1) + 1
		String format ="";
		int counter = 0;
		int result = 0;
		for (int i = (n*(n-1))+1; counter < n; i++) {
			if(i%2 == 1) {
				
				counter ++;
				
				result += i;
				
				format = format + " " + Integer.toString(i);
				
			
			}
		}
		System.out.println(format + " = sum "+ result);
		return result;
	       
    }
	
	//constant time complexity 
	
	public static int rowSumOddNumbers2(int n) {
	
	return n* n* n;
		
	}
	
	
	public static int rowSumOddNumbers3(int n) {
		
		return (int) Math.pow(n,3);
			
		}


}
