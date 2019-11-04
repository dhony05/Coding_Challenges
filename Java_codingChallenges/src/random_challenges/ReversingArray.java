package random_challenges;

import java.util.ArrayList;
import java.util.List;

public class ReversingArray {
	
	public static void main(String[] args) {
		
		
		System.out.println(reverseArray(new String[] {"a","b","c"}));
	}

	private static List reverseArray(String[] strings) {
		List<String> newSt = new ArrayList<>();
		for (int i = strings.length-1; i >= 0; i--) {
			newSt.add(strings[i]);

		}
		
		return newSt;
	}

}
