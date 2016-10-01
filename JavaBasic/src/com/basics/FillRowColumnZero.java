package com.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FillRowColumnZero {

	private static void fillRowColumnZero(List<List<Integer>> outerArrayList) {
		for (int i = 0; i < outerArrayList.size(); i++) {
			List<Integer> innerArrayList = outerArrayList.get(i);
			for (int j = 0; j < innerArrayList.size(); j++) {
				if (innerArrayList.get(j) == 0) {
					// set row zero
					setRowZero(innerArrayList);

					// set column zero
					for (int k = j; k < innerArrayList.size(); k++) {
						List<Integer> tempColumnList  = outerArrayList.get(k);
						tempColumnList.set(j, 0);
					}
				}
			}
		}
	}

	private static void setRowZero(List<Integer> innerList) {
		for (int i = 0; i < innerList.size(); i++) {
			innerList.set(i, 0);
		}
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> outerArrayList = create2DArray();
		//fillRowColumnZero(outerArrayList);
		
		@SuppressWarnings("unchecked")
		ArrayList<ArrayList<Integer>> temp = (ArrayList<ArrayList<Integer>>) outerArrayList.clone();
		temp.get(0).set(0,67);
		System.out.println("original list : "+outerArrayList.hashCode());
		System.out.println("clone list : "+temp.hashCode());;
		display2DList(outerArrayList);
		display2DList(temp);
	}

	private static ArrayList<ArrayList<Integer>> create2DArray() {
		ArrayList<ArrayList<Integer>> outerList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> innerList1 = new ArrayList<Integer>(Arrays.asList(1, 0, 1));
		ArrayList<Integer> innerList2 = new ArrayList<Integer>(Arrays.asList(0, 1, 1));
		ArrayList<Integer> innerList3 = new ArrayList<Integer>(Arrays.asList(1, 1, 1));
		outerList.add(innerList1);
		outerList.add(innerList2);
		outerList.add(innerList3);
		return outerList;
	}

	private static void display2DList(ArrayList<ArrayList<Integer>> outerArrayList) {
		for (ArrayList<Integer> innerList : outerArrayList) {
			for (Integer element : innerList) {
				System.out.print(element + "  ");
			}
			System.out.println();
		}
	}
}
