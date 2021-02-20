package codingbat.Logic1;

public class withoutDoublesChallenge {

	public static void main(String[] args) {
		System.out.println(withoutDoubles(3, 3, true));

	}
	
	/**
	 * 
	 * 
Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.


withoutDoubles(2, 3, true) → 5
withoutDoubles(3, 3, true) → 7
withoutDoubles(3, 3, false) → 6
	 * @param die1
	 * @param die2
	 * @param noDoubles
	 * @return
	 */
	
	public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
		
		//sorry ugly code here
		  if(noDoubles){
		    if(die1 == die2){
		      if(die1 == 6){
		        return 7;
		      }
		      return die1 + die2 + 1;
		    }
		    return die1 + die2;
		  }
		  return die1 + die2;
		  
		}


}
