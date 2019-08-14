package random_challenges;
import java.util.Arrays;
public class ASCIItransform {

    public static int[] transform(String text) {
        int[] ASCIIcode = new int[text.length()];
        for (int i = 0; i < text.length(); i++) {
            ASCIIcode[i] = (int)text.charAt(i) ;
           

        }
        System.out.println(Arrays.toString(ASCIIcode));
        return ASCIIcode;

    }

    public static void main(String[] args) {
        transform("admin");

    }
}