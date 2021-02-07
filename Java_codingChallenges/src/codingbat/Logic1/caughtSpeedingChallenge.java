package codingbat.Logic1;

public class caughtSpeedingChallenge {

	public static void main(String[] args) {
		System.out.println(caughtSpeeding(105, true));

	}
	
/**
 * 
You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.


caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0
 * @param speed
 * @param isBirthday
 * @return
 */
	
	
	public static int caughtSpeeding(int speed, boolean isBirthday) {
		  int limit = 0;
		  // if birthday
		if(isBirthday){
		  limit = 5;
		  if(speed<=60+limit){
		    return 0;
		  }
		  else if((speed>=61)&&(speed<=81+limit)){
		    return 1;
		  }
		  return 2;
		  
		}
		// if not birthday
		if((speed>=61)&&(speed<=81)){
		    return 1;
		  }else if(speed>=81){
		    return 2;
		  }

		  return 0;
		}


}
