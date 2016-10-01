package Algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SpiralMatrix {

	static void printSpiral(int[][] array) {
		int row = array.length - 1;
		int col = array[0].length - 1;
		int col_start = 0;
		int row_start = 0;
		while (row_start < row && col_start < col) {

			for (int i = col_start; i <= col; i++) {

				System.out.print(" " + array[col_start][i]);
			}
			col_start++;
			for (int j = row_start; j < row; j++) {
				System.out.print(" " + array[j + 1][col]);
			}
			row_start++;

			if (col_start < col) {
				for (int i = col; i >= col_start; --i) {
					System.out.print(" " + array[row][i - 1]);
				}
				row--;
			}
			if (row_start <= row) {
				for (int j = row; j >= row_start; j--) {
					System.out.print(" " + array[j][col_start - 1]);
				}
				col--;
			}
		}

	}

	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		int row = a.size() - 1;
		int col = a.get(0).size() - 1;
		int col_start = 0;
		int row_start = 0;
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 
		 if(row==0 && col==0){
			  result.add(a.get(row).get(col));
			 
		 }
		 while (row_start < row && col_start < col) {

			for (int i = col_start; i <= col; i++) {
				result.add(a.get(col_start).get(i));
				//System.out.print(" " + list.get(col_start).get(i));
			}
			col_start++;
			for (int j = row_start; j <= row; j++) {
				result.add(a.get(j + 1).get(col));
				//System.out.print(" " + list.get(j + 1).get(col));
			}
			row_start++;

			if (col_start < col) {
				for (int i = col; i >= col_start; --i) {
					result.add(a.get(row).get(i - 1));
					//System.out.print(" " + list.get(row).get(i - 1));
				}
				row--;
			}
			if (row_start <= row) {
				for (int j = row; j >= row_start; j--) {
					result.add(a.get(j).get((col_start - 1)));
					//System.out.print(" " + list.get(j).get((col_start - 1)));
				}
				col--;
			}
		}
		return result ;
	}

	public static void main(String[] args) {

		int array[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		printSpiral(array);
		
		
		List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	/*	list.addAll(Arrays.asList(1, 2, 3, 4));
		list.add(Arrays.asList(5, 6, 7, 8));
		list.add(Arrays.asList(9, 10, 11, 12));
		list.add(Arrays.asList( 13, 14, 15, 16 ));
		spiralOrder(list);*/
	}
}
