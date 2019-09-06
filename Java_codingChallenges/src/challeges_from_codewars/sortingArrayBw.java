package challeges_from_codewars;

/*
You have an array of numbers.
Your task is to sort ascending
odd numbers but even numbers must be on their places.
Zero isn't an odd number and you don't need to move it.
If you have an empty array, you need to return it.

sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
*/
import java.util.Arrays;

public class sortingArrayBw {

    public static void main(String[] args) {
        int[] test = { 5, 3, 2, 8, 1, 4 };
        int[] test1 = { 5, 8, 9, 10, 2, 6, 1, 4 };
        System.out.println(Arrays.toString(sortArray2(test)));
        System.out.println(Arrays.toString(sortArray(test1)));

    }

    public static int[] sortArray(int[] array) {
        /*
         * Here we created a nestedloop to iterate throught the array, we check if there
         * are even numbers to skip them and then continue with the process we check if
         * next number is odd to swap it with the current number in the index at the end
         * we return the array
         */
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                continue;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] % 2 != 0) {
                    if (array[i] > array[j]) {
                        array[i] = array[i] + array[j];
                        array[j] = array[i] - array[j];
                        array[i] = array[i] - array[j];
                    }
                }
            }
        }

        return array;

    }
    /*
     * This one is anotherone with better time complexity than the one above
     * O(NlogN) < O(N^2) consist in get index of odd numbers add it to a new array
     * sort it put then back in the original array
     */

    public static int[] sortArray2(int[] array) {
        int[] tempArray = new int[array.length];
        int max = Arrays.stream(array).max().getAsInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                tempArray[i] = array[i];
                array[i] = 0;
            } else {
                if (max % 2 == 0) {
                    tempArray[i] = max;
                } else {
                    tempArray[i] = max + 1;
                }
            }
        }
        Arrays.sort(tempArray);
        int index = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (array[i] == 0) {
                array[i] = tempArray[index];
                index++;
            } else {
                i++;
            }

        }

        return array;
    }
}