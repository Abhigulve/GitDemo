package Algorithms.arrays;

import java.util.ArrayList;

public class SetMatrixZeros {
	static ArrayList<ArrayList<Integer>> setMatrixZeros(
			ArrayList<ArrayList<Integer>> mat) {
		
		ArrayList<ArrayList<Integer>> resmat =new ArrayList<ArrayList<Integer>>();
		if (mat == null || mat.size() == 0) {
			return null;
		}		
		
		for (int i = 0; i < mat.size(); i++) {
			//List<Interger> temp = mat.get(i);
			for (int j = 0; j < mat.get(0).size(); j++) {
				if (mat.get(i).get(j) == 0) {
					ArrayList< Integer>l1=new ArrayList<Integer>();
					for (int j2 = 0; j2 < mat.get(0).size(); j2++) {
						l1.add(0);
					}
					resmat.add(i, l1);
					//System.out.println(resmat.get(i));
					for (int j2 = 0; j2 < mat.size(); j2++) {
						if(j2>resmat.size()-1){
							ArrayList<Integer>list=new ArrayList<Integer>();
							list.add(j,0);
							resmat.add(j2,list);
						}else {
							resmat.get(j2).add(j,0);
						}
					}
				}
			}
		}

		return resmat;
	}
	
	
	int [][] setMatrixZerosUsingMat(){
		
		
		return null;
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		ArrayList<Integer> l4 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(1);
		l1.add(0);
		l1.add(1);
		mat.add(0, l1);
		
		l2.add(0);
		l2.add(1);
		l2.add(1);
		l2.add(1);
		mat.add(1, l2);
		l3.add(1);
		l3.add(1);
		l3.add(1);
		l3.add(1);
		mat.add(2, l3);

		 l4.add(1);
		 l4.add(1); 
		 l4.add(1);
		 l4.add(0);
		 mat.add(3,l4);
		 
System.out.println(mat);
		System.out.println(setMatrixZeros(mat));
	}
}
