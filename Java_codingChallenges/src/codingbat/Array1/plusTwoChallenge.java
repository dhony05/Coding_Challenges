package codingbat.Array1;

public class plusTwoChallenge {

	
	/***
	 * Given 2 int arrays, each length 2,
	 *  return a new array length 4 containing all their elements.


plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
	 * @param a
	 * @param b
	 * @return
	 */
	public int[] plusTwo(int[] a, int[] b) {
		  int[] doubleArr = {a[0],a[1],b[0],b[1]};
		  return doubleArr;
		}


}
