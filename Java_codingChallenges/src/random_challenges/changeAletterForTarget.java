package random_challenges;

import java.util.Scanner;

public class changeAletterForTarget {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Sentence or word: ");
		String sentence  = sc.nextLine();
		
		System.out.print("Enter target letter:");
		String target = sc.nextLine();
		
		System.out.println("Enter new value: ");
		String newValue = sc.nextLine();
		
		System.out.println(changeTarget(sentence,target,newValue));

	}

	public static String changeTarget(String sentence, String target, String newValue) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == target.charAt(0)){
				sb.append(newValue);
				sb.append(sentence.charAt(i));
			}else {
				sb.append(sentence.charAt(i));
			}
		}
		return sb.toString();
	}

}
