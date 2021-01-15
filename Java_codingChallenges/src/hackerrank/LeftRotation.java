package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {

	public static void main(String[] args) {
		int d = 4;
		
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			arr.add(i+1);
		}
		
		System.out.println("List: " + arr);
		
		System.out.println("Number of rotations: "+ d);
		
		
		System.out.println("List after rotations: " + rotateLeft(d,arr));
				

	}
	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		
		List<Integer> result = new  ArrayList<Integer>();
		
		for (int i = 0; i < arr.size(); i++) {
		result.add(arr.get((i+d)%arr.size())); // need to try again this approach 
		}
			
		return  result;
	}
	

}
