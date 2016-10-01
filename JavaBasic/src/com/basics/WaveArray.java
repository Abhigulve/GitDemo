package com.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WaveArray {

	static ArrayList<Integer> wave(ArrayList<Integer> list) {

		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer paramT1, Integer paramT2) {
				return paramT1 - paramT2;
			}
		});
		
		for (int i=0; i<list.size()-1; i += 2) {
			swap(list,i,i+1);
		}
		return list;
	}

	static void swap(List<Integer> list, int first, int second) {
		int temp=list.get(first);
		list.set(first, list.get(second));
		list.set(second, temp);
	}

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(4);
		System.out.println(wave(new ArrayList<Integer>()));
	}
}
