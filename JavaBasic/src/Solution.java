import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	// DO NOT MODFIY THE LIST.
	public int maxSubArray(final List<Integer> a) {
		int max = a.get(0);
		int current_max = a.get(0);
		int start = 0, end = 0;
		for (int i = 1; i < a.size(); i++) {
			// current_max = Math.max(a.get(i), current_max + a.get(i));
			if (a.get(i) > (current_max + a.get(i))) {
				current_max = a.get(i);
				start = i;
			} else {
				current_max = current_max + a.get(i);
			}
			if (max < current_max) {
				max = current_max;
				end = i;
			} else {
			}
			// max = Math.max(max, current_max);
		}
		for (int i = start; i <= end; i++) {
			System.out.print(a.get(i) + " ");
		}

		return max;
	}

	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		int i = 0, carry = 0;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		while (a.get(i) != 0) {
			i++;
		}
		int new_digit = a.get(a.size()) + 1;
		for (int j = a.size(); j > i; j--) {
			if (new_digit > 10) {
				carry = new_digit / 10;
				new_digit = new_digit % 10;
			}else {
				
			}
		}
		return a;

	}

	public static void main(String[] args) {

		System.out.println(new Solution().maxSubArray(Arrays.asList(2, 1, 3, 4,
				1, 2, 1, 5, 4)));
	}

}
