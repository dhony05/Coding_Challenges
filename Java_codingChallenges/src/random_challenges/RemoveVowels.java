package random_challenges;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.nextLine();
		solution(n,str);
		sc.close();

	}

	private static void solution(int n, String str) {
		String result = str.replaceAll("[AaEeIiOoUu]","");
		System.out.println(result);
	}

}
