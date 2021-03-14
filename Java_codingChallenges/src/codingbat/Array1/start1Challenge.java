package codingbat.Array1;

public class start1Challenge {

	public int start1(int[] a, int[] b) {

		  /**
		   * link:https://codingbat.com/prob/p109660
Start with 2 int arrays, a and b, of any length.
 Return how many of the arrays have 1 as their first element.


start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
		   */
		  int aLen = a.length;
		  int bLen = b.length;
		  if ((aLen != 0)&&(bLen != 0)){
		   
		   if((a[0] == 1 )&& (a[0] == b[0])){
		    return a[0]+ b[0];
		   }else if (a[0] == 1 || b[0] == 1 ){
		    return 1;
		   }
		  }
		  else if(
		    ((aLen == 0)&&(bLen != 0) && ( b[0] == 1 )) ||
		    ((bLen == 0)&&(aLen != 0) && ( a[0] == 1 ))
		  ){
		      return 1;
		  }
		  
		  
		  return 0;
		}

}
