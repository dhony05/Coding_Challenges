package challeges_from_codewars;

public class CenturyReturn{


    public static void main(String[] args) {
       System.out.println( century(1));
       System.out.println( century(500)); 
       System.out.println(century(1000));
        System.out.println(century(1560));
        System.out.println(century(2000));

    }

    public static int century(int number) {
        // your code goes here
        int cent = 0;
       if(number <=0 ){
           cent = 0;


        
       }else if(number <= 100){
           cent = 1;

       }
       else if(number % 100 == 0){
           cent = number/100;

       }else {
            cent = (number/100) + 1;

       }
        return cent;
      }
      
}