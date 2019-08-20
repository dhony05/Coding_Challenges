package challeges_from_codewars;


/*
The most basic encryption method is to map a char to another char by a certain math rule.
 Because every char has an ASCII value, we can manipulate this value with a simple math expression. 
 For example 'a' + 1 would give us 'b', because 'a' value is 97 and 'b' value is 98.
encrypt("a",1) = "b"
*/
public class BasicEncrypt {

    public static char looping(int num){
        while(num>255){num -= 256;}return (char)num;}

    public static String encrypt(String text, int rule) {
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, looping(sb.charAt(i) + rule));         
            }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        encrypt("admin",1);
        encrypt("ggsabuvdtqe", 361);
        encrypt("qtd", 120);


    }
}