package challeges_from_codewars;

import java.util.Arrays;

public class UniqueNumber {

	public static void main(String[] args) {

		double arr[] = new double[] { 1, 1, 1, 3, 1 };
		findUniq(arr);
		double arr2[] = new double[] { 1, 4, 5, 6, 5, 6, 1, 1 };
		findUniq(arr2);

	}

	public static double findUniq(double arr[]) {

		System.out.println(Arrays.stream(arr).distinct().count());
		return Arrays.stream(arr).distinct().count();

	}

}
