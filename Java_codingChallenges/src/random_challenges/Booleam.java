package random_challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Anlu{
	int apiKey ;
	String locationId;
	String clientId;
	
	
	
	public Anlu(int apiKey, String locationId,String clientId) {
		this.apiKey = apiKey;
		this.locationId = locationId;
		 this.clientId = clientId;
	}
}
public class Booleam {

	public static List CreateTrans(int limit) {
		
		ArrayList<Anlu> trans = new ArrayList<>();
		String[] locationIDS = {"NJ","NE","NY","VA","NC","MA","WI"};
		int l = 0;
		while(l< limit){
			int index = new Random().nextInt(locationIDS.length-1);
			int ids = new Random().nextInt(2000000);
			//System.out.println(locationIDS[index]);
			Anlu m =  new Anlu(ids,locationIDS[index],"CreditPayment-R");
			trans.add(m );
			
			l++;
		}
		
		return trans;
	}
	
	public static void main(String[] args) {
	
		
	
	
		
		
//		
		ArrayList<Anlu> trans = (ArrayList<Anlu>) CreateTrans(5);
//		trans.add( Anlu(2342342,"NJ","CreditPayment-R"));
//		trans.add(new Anlu(2342342,"NE","CreditPayment-R"));
//		trans.add(new Anlu(2342342,"NY","CreditPayment-R"));
//		trans.add(new Anlu(2342342,"VA","CreditPayment-R"));
//		
		
//		Boolean isRestrictedData = ((locationId.equalsIgnoreCase("NJ"))||
//				(locationId.equalsIgnoreCase("NE")) ||
//				(locationId.equalsIgnoreCase("VA")));
		
		for (Anlu tran: trans){
			if((tran.locationId.equalsIgnoreCase("NJ"))||
					(tran.locationId.equalsIgnoreCase("NE")) ||
					(tran.locationId.equalsIgnoreCase("VA"))) {
				System.out.println("Restricted stated " + tran.locationId);
				
			}else {
				System.out.println(tran.locationId);
			}
		}

	}
	


}
