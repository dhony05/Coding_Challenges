package codingbat.WarmUp;

public class StringE {

	/**
	 * 
	 * url:https://codingbat.com/prob/p173784
	 * 
Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
	 * 
	 * @param str
	 * @return
	 */
	public boolean stringE(String str) {
		  int count = 0;
		  for(char c : str.toCharArray()){
		    if(c == 'e'){
		      count ++;
		    }
		  }
		  return (count>=1 && count<=3);
		}

}
