package challeges_from_codewars;

/*
Welcome. In this Challenge you are asked to square every digit of a number.

For example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1.

Note: The function accepts an integer and returns an integer
 */
public class SquareChallenge {

    public static void main(String[] args) {

        squareDigits(5555);
        squareDigits(12345);
        // Testing
    }

    // Here I created two for loops one to populate the newN array and one to
    // populate the string builder
    public static int squareDigits(int n) {
        int leng = String.valueOf(n).length();
        int[] newN = new int[leng];
        for (int i = leng - 1; i >= 0; i--) {
            newN[i] = (n % 10) * (n % 10);
            n = n / 10;
        }
        StringBuilder result = new StringBuilder();
        for (int var : newN) {
            result.append(var);
        }
        // This method will return a convertion of the stringbuilder to an int
        System.out.println(Integer.parseInt(result.toString()));
        return Integer.parseInt(result.toString());

    }
}