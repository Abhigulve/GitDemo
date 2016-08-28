package com.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAndReplaceNum {
	/*static void FindAndReplaceNum(int array[]) {
		int sum = 0;
		int numpresent[] = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			if (numpresent[array[i]] == 1) {
				int finalnum = (array.length * (array.length + 1) / 2);
				int actualnum = array[i] + (finalnum - sum);
				System.out.println(array[i] + " " + actualnum);

			} else {
				numpresent[array[i]] = 1;
			}
		}

	}
*/	
	public static ArrayList<Integer> repeatedNumber(final List<Integer> a) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		int sum = 0;
		int numpresent[] = new int[a.size() + 1];
		for (int i = 0; i < a.size(); i++) {
			sum = sum + a.get(i);
			if (numpresent[a.get(i)] == 1) {
				list.add(a.get(i));
				int finalnum = (a.size() * (a.size() + 1) / 2);
				int actualnum = a.get(i) + (finalnum - sum);
				list.add(actualnum);
			}
		}
		
	   return list; 
	}
	public static void main(String[] args) {
		int array[] = { 1, 3, 4, 5, 6, 6 };
		//FindAndReplaceNum(array);
		System.out.println(repeatedNumber(Arrays.asList(1, 3, 4, 5, 6, 6)));
	}
}
