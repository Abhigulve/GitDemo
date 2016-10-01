package com.basics;

import java.util.ArrayList;
import java.util.List;

public class KthRowPascal {
	static int C(int n, int r) {
		if (r > n / 2)
			r = n - r; // because C(n, r) == C(n, n - r)
		int ans = 1;
		int i;

		for (i = 1; i <= r; i++) {
			ans *= n - r + i;
			ans /= i;
		}
		return ans;
	}

	static ArrayList<ArrayList<Integer>> getRow(int a) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		long sol;
		for (int line = 0; line < a; line++)
		  {
			ArrayList<Integer>innerlist=new ArrayList<Integer>();
		for (int i = 0; i <= line; i++) {
			sol = C(line, i);
			innerlist.add((int) sol);
		}  
		list.add(innerlist);
		}
		return list;
	}
public static void main(String[] args) {
	System.out.println(getRow(5));
}
}
