package random_challenges;

public class ReverseWords {

	public static void main(String[] args) {
		String str = " the sky is blue";
		
		
		System.out.println(reverse(str));

	}
	
	public static String reverse(String str) {
		
		String[] newStr = str.split(" ");
		
		String result = "";
		for(int i = 0;i<newStr.length ; i++) {
			
			
			if(i == newStr.length-1) {
				result = newStr[i]  + result ;
				
			}else {
		   result = newStr[i] + " " + result ;
			}
		   
		}
		
		
		
		return result;
		 //call nurse 212 268 4319
//		855-491-2667 family leave assistant
//		888-692-9355 mental health
//		1800-621-4673 
		
		
	}
}
