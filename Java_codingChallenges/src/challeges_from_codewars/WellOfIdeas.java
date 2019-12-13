package challeges_from_codewars;

public class WellOfIdeas {
	
	/***
	 * In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'.
	 *  If there are one or two good ideas, return 'Publish!', 
	 *  if there are more than 2 return 'I smell a series!'. 
	 *  If there are no good ideas, as is often the case, return 'Fail!'.
	 * @param args
	 */



	public static void main(String[] args) {
		

		//should return "Fail!"
		well(new String[] {"bad","bad","bad"});
		//should return "Publish!"
		well(new String[] {"good", "bad", "bad", "bad", "bad"});
		// "I smell a series!"
		well(new String[] {"good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"});
	}



	public static String well(String[] strings) {
		int count = 0;
		String results = "Publish! - I smell a series! - Fail!";
		String[] resultsWords = results.split(" - ");
		
		for (int i = 0; i < strings.length; i++) {
			if(strings[i].equalsIgnoreCase("good")) {
				count ++;
			}
		}
		if(count > 0 && count <3) {
			System.out.println(resultsWords[0]);
			return resultsWords[0];
		} else if(count >2 ) {
			System.out.println(resultsWords[1]);
			return resultsWords[1];
		}else {
			System.out.println(resultsWords[2]);
			return resultsWords[2];
		}
		
	}
}
