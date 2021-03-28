package codingbat.Array1;

public class make2Challenge {

	
	/***
	 * url:https://codingbat.com/prob/p143461
	 * 
	 *
	 * Given 2 int arrays, a and b, return a new array length 2 containing,
	 *  as much as will fit, the elements from a followed by the elements from b.
	 *   The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.


make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
	 * @param a
	 * @param b
	 * @return
	 */
	public int[] make2(int[] a, int[] b) {
		  int [] arr = new int[2];
		  
		  int aLen = a.length;
		  int bLen = b.length;
		  if(aLen == 0){
		      arr[0] = b[0];
		      arr[1] = b[1];
		      return arr;
		  } else if(bLen == 0){
		      arr[0] = a[0];
		      arr[1] = a[1];
		      return arr;
		  }else if( (aLen == 1) || (bLen ==1)){
		    arr[0] = a[0];
		    arr[1] = b[0];
		    return arr;
		  }
		  arr[0] = a[0];
		  arr[1] = a[1];
		  return arr;
		  
		}
}
