package Algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxNonNegativeSubArray {
/*	static int nonNegativeSubArray(ArrayList<Integer>list){

		if(list.size()==0){
			return 0;
		}
		int current=list.get(0);
		int max_conti=list.get(0);
		int non_vonti=0;
		for (int i = 1; i < list.size(); i++) {
			current=Math.max(list.get(i), current+list.get(i));
			max_conti=Math.max(max_conti, current);
		}
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)>0){
				non_vonti+=list.get(i);
			}
		}
		
		
		return max_conti;
		//System.out.println(non_vonti);
	}
	
	
	
	
	static void nonNegativeSubArray(int[] list){
     
		int current=-9999;
		int max=-9999;
    int non_vonti=0;
		if(list.length==0){
			
		}
		else{
		for (int i = 0; i < list.length;i++){
			current=Math.max(list[i], current+list[i]);
			max=Math.max(max, current);
		}
            
            for (int i = 0; i < list.length; i++) {
			if(list[i]>0){
				non_vonti+=list[i];
			}
		}
		System.out.println(max +" " +non_vonti);
	} 
}*/
	
	
	public static  List<Integer> getRow(int rowIndex) {
		ArrayList<Integer> result = new ArrayList<Integer>();
	 
		if (rowIndex < 0)
			return result;
	 
		result.add(1);
		for (int i = 1; i <= rowIndex; i++) {
			for (int j = result.size() - 2; j >= 0; j--) {
				result.set(j + 1, result.get(j) + result.get(j + 1));
			}
			result.add(1);
		}
		return result;
	}

	
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(2);
		list.add(-1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(-5);
		int array[]={-2, 1};
		System.out.println(getRow(5));
	//nonNegativeSubArray((array));
	//System.out.println(	nonNegativeSubArray(list));
}
}
