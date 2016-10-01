package com.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sumof3 {
	public static  List<List<Integer>> threeSum(int[] nums) {
		int next = 0, last = 0;
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (nums.length < 3) {
			return res;
		}
		for (int i = 0; i < nums.length; i++) {
			next = i + 1;
			last = nums.length - 1;
			while (next < last) {
				if (nums[i] + nums[next] + nums[last] == 0) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(nums[i]);
					list.add(nums[next]);
					list.add(nums[last]);
					res.add(list);

				} else if (nums[i] + nums[next] + nums[last] < 0) {
					next++;

				} else
					last--;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int []array={-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(array));
	}
}
