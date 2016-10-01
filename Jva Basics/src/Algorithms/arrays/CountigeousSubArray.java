package Algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountigeousSubArray {
/*	int MaxCountigiousSubArray(int[] a, int size) {

		   int max_so_far = a[0];
		   int curr_max = a[0];
		 
		   for (int i = 1; i < size; i++)
		   {
			   System.out.println(curr_max);
		        curr_max = Math.max(a[i],           curr_max+a[i]);
		        max_so_far = Math.max(max_so_far, curr_max);
		   }
		   return max_so_far;


	}
	
	public int maxSubArray(final List<Integer> a) {
	    int max=a.get(0);
	    int current_max=a.get(0);
	    
	    for (int i = 1; i < a.size(); i++){
			current_max=Math.max(a.get(i), current_max+a.get(i));
	    	max=Math.max(max, current_max);
	    	}
	    
	    return max;
	}
*/
	
	
	static ArrayList<Integer> performOps(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
                B.set(i, A.get(i));
                B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;
}


	public static void main(String[] args) {
        CountigeousSubArray a=new CountigeousSubArray();
        int array[]={1,4,-3,-1,7};
       // System.out.println(a.MaxCountigiousSubArray(array,array.length));
        ArrayList<Integer>A = new ArrayList<Integer>();
        A.add(5);
        A.add(10);
        A.add(2);
        A.add(1);
        
        ArrayList<Integer> B = performOps(A);
        for (int i = 0; i < B.size(); i++) {
                System.out.print(B.get(i) + " ");
        }

        
	}    
	}