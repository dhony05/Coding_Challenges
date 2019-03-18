package challeges_from_codewars;

import java.util.Arrays;


/**
 * 
 * 
 * 
 * Write Number in Expanded Form
	You will be given a number and you will need to return it as a string in Expanded Form. For example:

	Kata.expandedForm(12); # Should return "10 + 2"
	Kata.expandedForm(42); # Should return "40 + 2"
	Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
	NOTE: All numbers will be whole numbers greater than 0.
 *
 */

public class Expanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		expandedForm(2);
		expandedForm(12);
		expandedForm(42);
		expandedForm(70304);

	}
	
	public static String expandedForm(int num){
		
		String numString[] = Integer.toString(num).split("");
		
		for(int i =0; i<numString.length-1; i++){
			if(Integer.valueOf(numString[i])>0){
				for(int j =i; j < numString.length -1; j++){
					numString[i] += 0;
				}
				
			}
		}
		
		String newForm = Arrays.toString(numString);
		newForm = newForm.substring(1, newForm.length()-1).replace(", 0","").replace(",", " +"); // what save me 
		System.out.println(newForm);
		return newForm;

		
	}

	}
