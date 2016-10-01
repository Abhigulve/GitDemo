package Algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

public class RotateMatrix {

	public static void rotate(List<ArrayList<Integer>> list) {
		int row1, col1, prev = 0, curr1;

		row1 = 0;
		col1 = 0;
		int n = list.get(0).size() - 1;
		int m = list.size() - 1;
		while (row1 < m || col1 < n) {
			
			
			if (list.size() != 1 && list.get(0).size()!=1) {
				prev = list.get(row1 + 1).get(col1);
				for (int i = col1; i <= n; i++) {
					curr1 = list.get(row1).get(i);
					list.get(row1).set(i, prev);
					prev = curr1;
				}
				row1++;
				for (int j = row1; j <= m; j++) {
					curr1 = list.get(j).get(n);
					list.get(j).set(n, prev);
					prev = curr1;
				}
				n--;
				for (int i = n; i >= col1; i--) {
					curr1 = list.get(m).get(i);
					list.get(m).set(i, prev);
					prev = curr1;
				}
				m--;
				for (int i = m; i >= row1; i--) {
					curr1 = list.get(i).get(col1);
					list.get(i).set(col1, prev);
					prev = curr1;
				}
				col1++;
			} else if(list.size() == 1){
				for (int i = n; i >= col1; i--) {
					curr1 = list.get(m).get(i);
					list.get(m).set(i, prev);
					prev = curr1;
				}
				
			}

		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		 ArrayList<Integer> l2 = new ArrayList<Integer>();
		 ArrayList<Integer> l3 = new ArrayList<Integer>();
		 ArrayList<Integer> l4 = new ArrayList<Integer>();
		l1.add(1);
		//l1.add(2);
		//l1.add(3);
		//l1.add(4);
		mat.add(0, l1);
		
		  l2.add(5); //l2.add(6); l2.add(7); l2.add(8);
		  mat.add(1, l2);
		  l3.add(9); //l3.add(10); l3.add(11); l3.add(12); 
		  mat.add(2, l3);
		  
		  l4.add(13); //l4.add(14); l4.add(15); l4.add(16);
		  mat.add(3,l4);
		 
		rotate(mat);
	}
}
