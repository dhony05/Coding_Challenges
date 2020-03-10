package hackerrank;

import java.util.Scanner;

public class StringManipulation1 {
/***
 * Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of A and B .
Determine if A is lexicographically larger than B (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.
 * @param args
 */
public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
      
        Build(A,B);
        
    }
/***
 * This method will concatenate String A and String B ,
 * Will check if A is lexicographically larger than B  by utilizing each first character's ASCII code
 * 
 * @param A
 * @param B
 */
    public static void Build(String A , String B){
        String c = A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1);
        int len = (A.length() + B.length());
        System.out.println(len);

        if((int)A.charAt(0) > (int)B.charAt(0)){ // checking the 
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        System.out.println(c);
      
    }

}
