package random_challenges;

public class MergeString {

	public static void main(String[] args) {

		String a = "come";
		String b = "love";

		System.out.println(merge(a, b));

	}

	public static String merge(String a, String b) {
		StringBuilder mergedString = new StringBuilder();
		if (a.length() < b.length()) {
			for (int i = 0; i < a.length(); i++) {
				mergedString.append(a.charAt(i));
				mergedString.append(b.charAt(i));
			}
			for (int i = a.length(); i < b.length(); i++) {
				mergedString.append(b.charAt(i));
			}

		} else if (a.length() > b.length()) {
			for (int i = 0; i < b.length(); i++) {
				mergedString.append(a.charAt(i));
				mergedString.append(b.charAt(i));
			}
			for (int i = b.length(); i < a.length(); i++) {
				mergedString.append(a.charAt(i));
			}

		} else {
			for (int i = 0; i < a.length(); i++) {
				mergedString.append(a.charAt(i));
				mergedString.append(b.charAt(i));
			}
		}

		return mergedString.toString();
	}

}
