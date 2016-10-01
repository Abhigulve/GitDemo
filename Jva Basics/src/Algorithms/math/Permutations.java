package Algorithms.math;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Permutations {
	private static char[] str = new char[3];

	static void permutations(char[] str, int l, int r) {
		int j = 0;
		if (l == r) {
			System.out.println(str);
		} else {
			for (j = 1; j <= r; j++) {

				// it will swap the elements
				swap(l + 1, l + j);
				permutations(str, l + 1, r);
				swap(l + j, l + 1);
			}
		}
	}

	static void swap(int l, int m) {
		char temp = str[l];
		str[l] = str[m];
		str[m] = temp;
	}

	public int findRank(String A) {
		int length = A.length();
		long strFactorial = factorial(length);
		long rank = 1;
		for (int i = 0; i < length; i++) {
			strFactorial /= length - i;
			rank += findSmallerInRight(A, i, length - 1) * strFactorial;
		}
		System.out.println("Rank : " + Integer.MAX_VALUE);
		rank %= 1000003;
		return (int) rank;
	}

	public static long factorial(int n) {
		return n <= 1 ? 1 : (n * factorial(n - 1));
	}

	public static int findSmallerInRight(String A, int low, int high) {
		int countRight = 0;
		for (int i = low + 1; i <= high; i++) {
			if (A.charAt(i) < A.charAt(low))
				countRight++;
		}
		return countRight;
	}

	// contains count of smaller characters in whole string
	public static void populateAndIncreaseCount(int[] count, char[] str) {
		int i;

		for (i = 0; str[i] >= 'a' && str[i] <= 'z'; ++i)
			++count[str[i]];

		for (i = 1; i < 256; ++i)
			count[i] += count[i - 1];
	}

	/*
	 * //Removes a character ch from count[] array //constructed by
	 * populateAndIncreaseCount() public static void updatecount (int[] count,
	 * char ch) { int i; for( i = ch; i < 256; ++i ) --count[i]; }
	 * 
	 * //A function to find rank of a string in all permutations //of characters
	 * public static int findRank (char[] str) { int len = str.length; long mul
	 * = factorial(len); int rank = 1, i; int[] count = new int[256]; // all
	 * elements of count[] are initialized with 0
	 * 
	 * // Populate the count array such that count[i] contains count of //
	 * characters which are present in str and are smaller than i
	 * populateAndIncreaseCount( count, str );
	 * 
	 * for (i = 0; i < len; ++i) { mul /= len - i;
	 * 
	 * // count number of chars smaller than str[i] // fron str[i+1] to
	 * str[len-1] rank += count[ str[i] - 1] * mul;
	 * 
	 * // Reduce count of characters greater than str[i] updatecount (count,
	 * str[i]); }
	 * 
	 * return rank; }
	 */
	static   void rank(String str) {
       		List<String> list = new ArrayList<String>();
        	   permutation("", str, list);
        	   Collections.sort(list);
       		System.out.println(list.indexOf(str)+1);
           }
	private  static void permutation(String prefix, String str, List<String> list) {
		int n = str.length();

		if ((n == 0)) {
			list.add(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				permutation(prefix + str.charAt(i),str.substring(0, i) + str.substring(i + 1, n), list);
			}
		}
		
	}

	public static void main(String[] args) {
		str[0] = 'a';
		str[1] = 'b';
		str[2] = 'c';
		// permutations(str, 0, 2);
		rank("acb");
		
	}
}
