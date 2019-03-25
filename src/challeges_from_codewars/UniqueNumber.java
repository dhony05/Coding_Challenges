package challeges_from_codewars;

import java.util.ArrayList;


public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double arr[] = new double[]{  1, 1, 1, 2, 1,3, 1};
		findUniq(arr);
		double arr2[] = new double[]{  1,3,2,3,3,34,5,6,7,8,5,5,5, 1, 1, 2, 1, 1};
		findUniq(arr2);


	}
	
    public static double findUniq(double arr[]) {
    	
    	int m = 0;
    	int n = 0;
    	ArrayList<Double> list = new ArrayList<Double>();
    	while(m<arr.length-1){
    		System.out.println("len");
    		n++;
    		if(arr[m] == arr[n]){
    			m++;
    			
    			
    		}else if(!(arr[m] == arr[n])){
    			
    			list.add(arr[n]);
    			n++;
    		}else{
    			break;
    		}
    		
    	}
    	
    	System.out.println(list.get(0));
    	
    	return 0;
		
    	
    }


}
