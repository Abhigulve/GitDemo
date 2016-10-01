package Algorithms.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MaxGap {

	static int maximumGap(final ArrayList<Integer> a){
		
		Collections.sort(a, new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				if(arg0<arg1){
					return -1;
				}else
				return 1;
			}
		});
		int max=0;
		for (int i = 0; i < a.size()-1; i++) {
			if(max<(a.get(i+1)-a.get(i))){
				max=a.get(i+1)-a.get(i);
			}
		}
		return max;
		
	}
	
	
	public static void main(String[] args) {
		ArrayList< Integer>list=new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(8);
		System.out.println(maximumGap(list));
	}
}
