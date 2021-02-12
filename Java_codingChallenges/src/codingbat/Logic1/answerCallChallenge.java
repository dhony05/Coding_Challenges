package codingbat.Logic1;

public class answerCallChallenge {

	public static void main(String[] args) {
		System.out.println(answerCell(true, false, false));

	}
	
	
	/***
	 * link:https://codingbat.com/prob/p110973
	 * Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.


answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false
	 * @param isMorning
	 * @param isMom
	 * @param isAsleep
	 * @return
	 */
	
	public static  boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

		 if(!isAsleep){
		    if((isMorning)&&(!isMom)){
		      return false;
		    }
		    return true;
		   
		 }
		 return false;
		}


}
