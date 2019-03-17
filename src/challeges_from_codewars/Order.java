package challeges_from_codewars;

public class Order {
	
	/*
	 * Your task is to sort a given string. Each word in the string will contain a single number.
	 *  This number is the position the word should have in the result.
		Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
		If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
		
		"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
		"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
		""  -->  ""
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		order("is2 Thi1s T4est 3a");
		order("4of Fo1r pe6ople g3ood th5e the2");
		order("");

	}
	
/**
 * This method takes a string, the string using .split(" ") taking every backspace out the string.
 * Then it is stored in an array called  words_arr. if the string is empty it will going to be an empty space.
 * If the string is not empty then should go through a nested loop which search for the digit value and organize the elements on a new array 
 * The using the join method to combined all elements in the array and to concatenate the space bar and then it is returned.
 * 
 * 
 * @param words
 * @return
 */
	
	public static String order(String words) {

		int currentNumber;
		
		String words_arr[] = words.split(" ");
		String newArr[] = new String[words_arr.length];
		if(words.equals("")){
			return "";
		}else{
		for (int i =0; i<words_arr.length; i++){
			for(int j = 0; j<words_arr[i].length();j++){
				if((Character.isDigit(words_arr[i].charAt(j)))){	
					currentNumber = Character.getNumericValue((words_arr[i].charAt(j)));
					//System.out.print(currentNumber);
					newArr[currentNumber - 1] = words_arr[i];
				}
			}
			}
		}
		
		String join = String.join(" ", newArr);

		System.out.println(join);
		return join;
		
	}

}
