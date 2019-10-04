package challeges_from_codewars;

public class RowSumOddNumbers {

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
	
	//contant time complexity 
	
	public static int rowSumOddNumbers2(int n) {
	
	return n* n* n;
		
	}
	
	
	public static int rowSumOddNumbers3(int n) {
		
		return (int) Math.pow(n,3);
			
		}


}
