package challeges_from_codewars;

	public class Line {
		
		/**
		 * 
		 * @param args
		 * 
		 * The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line. Each of them has a single 100, 50 or 25 dollars bill. An "Avengers" ticket costs 25 dollars.

			Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.

			Can Vasya sell a ticket to each person and give the change if he initially has no money and sells the tickets strictly in the order people follow in the line?

			Return YES, if Vasya can sell a ticket to each person and give the change with the bills he has at hand at that moment. Otherwise return NO.
		 */
		public static void main(String[] args ){
			System.out.println(Line.Tickets(new int[] {25, 25, 50})); // => YES 
			
			System.out.println(Line.Tickets(new int[]{25, 100})); // => NO. Vasya will not have enough money to give change to 100 dollars
			System.out.println(Line.Tickets(new int[] {25, 25, 50, 50, 100})); // => NO. Vasya will not have the right bills to give 75 dollars of change (you can't make two bills of 25 from one of 50)
		}
		  public static String Tickets(int[] peopleInLine)
		  {
		        //Your code is here...
		       int amount25 = 0; int amount50 = 0; int amount100 = 0;
		       
		       for(int i = 0; i <peopleInLine.length; i++){
		       
		       
		         if(peopleInLine[i] == 25){
		         amount25 += 1;
		         
		         }
		         
		        if(peopleInLine[i] == 50){
		             if(amount25 >= 1){
		           amount25 -= 1;
		           amount50 += 1;
		           
		           } 
		           else if(amount50 >= 1) {
		           amount50 -= 1;
		           
		           }
		           else {
		           return "NO";
		           }
		           }
		           
		        if(peopleInLine[i] == 100){
		         if(amount25 >= 3){
		          amount25 -= 3;
		          amount100 ++;
		           }
		        else if ((amount25 >= 1)&& (amount50 >=1)){
		            amount25 -= 1;
		            amount50 -= 1;
		            amount100 ++;
		          
		          }
		           else if((amount25 < 0) && (amount50 < 0)){
		           return "NO";
		       }
		       
		           else{
		           return "NO";
		          
		       }
		       }
		     
		       
		       
		       }
		      return "YES";
		       
		       
		       }
		       }
		       