package codingbat.Array1;

public class front11Challenge {

	/**
	 * url: https://codingbat.com/prob/p128270
	 * 
	 * Given 2 int arrays, a and b, of any length, return a new array 
	 * with the first element of each array. If either array is length 0, ignore that array.


front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
	 * @param a
	 * @param b
	 * @return
	 */
	public int[] front11(int[] a, int[] b) {
		  int aLen = a.length;
		  int bLen =  b.length;
		  int[] arr ;
		  
		  if ((aLen == 0) && (bLen == 0)){
		    return a;
		  }
		  else if(aLen == 0){
		    arr = new int[1];
		    arr[0] = b[0];
		    return arr;
		    
		  }else if (bLen == 0){
		    arr = new int[1];
		    arr[0] = a[0];
		    return arr;
		  }
		  arr = new int[2];
		   arr[0] = a[0];
		   arr[1] = b[0];
		   return arr;
		   
		}

}
