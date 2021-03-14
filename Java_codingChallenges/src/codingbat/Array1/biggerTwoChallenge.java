package codingbat.Array1;

public class biggerTwoChallenge {

	/**
	 * 
Start with 2 int arrays, a and b, each length 2. 
Consider the sum of the values in each array. Return the array which has the largest sum.
 In event of a tie, return a.


biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
	 * @param a
	 * @param b
	 * @return
	 */
	
	public int[] biggerTwo(int[] a, int[] b) {
		  int aSum = a[0] + a[1];
		  int bSum = b[0] + b[1];
		  if(aSum> bSum){
		    return a;
		  }else if(aSum == bSum){
		    return a;
		  }
		  return b;
		}

}
