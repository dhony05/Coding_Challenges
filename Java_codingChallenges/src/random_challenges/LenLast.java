package random_challenges;

public class LenLast {

	public static void main(String[] args) {
		String sentence = "This is a simple sentence";
		
		System.out.println(lasWordLen(sentence));
		System.out.println(getSpecificLen(sentence,6));

	}

	public static int lasWordLen(String sentence) {
		 String[] words = sentence.split(" ");
		 int len = words[words.length-1].length();
		
		return len;
		
	}
	
	public static int getSpecificLen(String sentence, int position) {
		String[] words = sentence.split(" ");
		//int len = words[words.length-1].length();
		
		try {
			if(!(position>words.length-1 && position <=0)) {
				return words[position].length();
			}
		} catch (Exception e) {
			
//			e.printStackTrace();
		}
		
		return -1;
		
	}

}
