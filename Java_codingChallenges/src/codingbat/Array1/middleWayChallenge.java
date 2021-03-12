package codingbat.Array1;

public class middleWayChallenge {

	
	/**
	 * link:https://codingbat.com/prob/p146449
	 * Given 2 int arrays, a and b, each length 3, 
	 * return a new array length 2 containing their middle elements.


middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
	 * @param a
	 * @param b
	 * @return
	 */
	public int[] middleWay(int[] a, int[] b) {
		  int [] result = {a[1],b[1]};
		  return result;
		}

}
