package challeges_from_codewars;

public class StringToArray {
/// This Challenge you are asked to convert a string to an array
	public static void main(String[] args) {
		
		toArray("Robin Signh");

	}

	public static String[] toArray(String string) {
		
		
		String [] newA = string.split(" ");
		return newA;
	}

}
