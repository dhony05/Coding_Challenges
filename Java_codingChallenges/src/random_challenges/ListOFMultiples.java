package random_challenges;

import java.util.ArrayList;
import java.util.List;

public class ListOFMultiples {

	public static void main(String[] args) {
		System.out.println(getMultiples(7,5));
		System.out.println(getMultiples(12,10));

	}
	
	public static List<Integer> getMultiples(int a , int b){
		List<Integer> multiples = new ArrayList<Integer>();
		int i = 1;
		 while(i <= b) {
			 multiples.add(i*a);
			 i++;
		 }
		 
		 return multiples;
	}

}
