package Algorithms.math;

import java.util.*;

class GFG {
	
	 /* public static void main(String[] args) { int array[] = { 1, 2, 3, 4, 5,
	  5, 6 }; int[] temp ={0,0,0,0,0,0,0};
	 
	  for (int i = 0; i < array.length; i++) { if (temp[i] != 1) {
	 
	  temp[i] = 1; } else { int repeat = array[i], num = 0; if ((array[i + 1])
	  != repeat + 1) { num = repeat + 1; } else { num = repeat - 1; }
	  System.out.println(repeat + " " + num);
	  
	  }
	  
	  }
	 
	  } */
	 

	static void printRepeating(int arr[], int size) {
		int count[] = new int[size];
		int i, sum = 0, maxadd = 0, k = 0;
		for (i = 0; i < size; i++) {
			sum = sum  + arr[i];

			if (count[arr[i]] == 1) {
				k = i;
				System.out.print(arr[i] + " ");
			} else {
				count[arr[i]] = 1;
			}
		}
		maxadd = (arr.length *(arr.length + 1)) / 2;
		System.out.print(arr[k]+(maxadd-sum));
	}
	
	static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
	
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());
        
            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }


for (int i = 0; i < B.size(); i++) {
    for (int j = 0; j < B.get(i).size(); j++) {
            System.out.print(B.get(i).get(j) + " ");
    }
}
        return B;
}

	public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		int i=0 ,temp= A.get(0);;
		for ( i = 0; i < A.size(); i++) {
            
             A.add(A.get(i+1));
            
		}
		A.set(i,temp);
	return A;
	}
	
	
	
	public static void main(String[] args) {
ArrayList<Integer>a;

		int arr[] = { 4, 2, 4, 5, 6, 3, 1 };
		int arr_size = arr.length;
	//	printRepeating(arr, arr_size);
		
		ArrayList<ArrayList<Integer>> A=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		A.add(a1);
		ArrayList<Integer>a2=new ArrayList<Integer>();
		a2.add(5);
		a2.add(6);
		a2.add(7);
		a2.add(8);
		A.add(a2);
		ArrayList<Integer>a3=new ArrayList<Integer>();
		a3.add(9);
		a3.add(10);
		a3.add(11);
		a3.add(12);
		A.add(a3);

	}

}