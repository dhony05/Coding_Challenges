package codingbat.WarmUp2;

public class delDelChallenge {

	/**
	 * 
	 * url:https://codingbat.com/prob/p100905
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
	 * 
	 * 
	 * @param str
	 * @return
	 */
	
	public String delDel(String str) {
		  if(str.contains("del")){
		    if(str.charAt(1) == 'd' && str.charAt(2) == 'e'&& str.charAt(3) == 'l'){
		    String newStr = str.replace("del","");
		    return newStr;
		    }
		  }
		  return str;
		}

}
