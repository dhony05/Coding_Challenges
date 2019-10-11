package random_challenges;

public class ReversingSTring {

	public static void main(String[] args) {
		ReverseString("hello");
		
	}

	public static void ReverseString(String string) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(string);
		sb = sb.reverse();
		System.out.println(sb);
		
	}

}
