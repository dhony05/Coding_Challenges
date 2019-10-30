package hackerrank;

public class SparseArrays {

//	There is a collection of input strings and a collection of query strings. 
//	For each query string, determine how many times it occurs in the list of input strings.
//	For example, given input  and , we find  instances of ',  of '' and  of ''. For each query, 
//	we add an element to our return array, .
	public static void main(String[] args) {
		String[] strs = { "aba", "baba", "aba", "xxb" };
		String[] queries = { "aba", "xxb", "ab", "saa" };
		int[] result = matchingStrings(strs, queries);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static int[] matchingStrings(String[] strs, String[] queries) {
		int[] result = new int[queries.length];
		int count = 0;
		int index = 0;
		for (int i = 0; i < strs.length; i++) {

			if (index == queries.length) {
				break;
			} else if (strs[i].equals(queries[index])) {
				System.out.println("true: " + strs[i]);
				count++;
			}
			if (i == strs.length - 1) {
				result[index] = count;
				index++;
				// System.out.println(index);
				count = 0;

				i = -1;
			}

		}

		return result;

	}

}
