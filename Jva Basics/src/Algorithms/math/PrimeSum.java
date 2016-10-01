package Algorithms.math;

import java.awt.image.RescaleOp;
import java.util.ArrayList;

public class PrimeSum {
	static ArrayList<Integer> primeSum(int n) {
		ArrayList<Integer> listofnumbers = new ArrayList<Integer>();
		if(n<2){
			return listofnumbers;
		}
		int first=2;
		int second=n-first;
		while(first<=second){
				second=(n-first);
				if(isPrime(second)==true && isPrime(first)){
					listofnumbers.add(first);
					listofnumbers.add(second);
					return listofnumbers;
				}
				first++;
		}
		
		return listofnumbers;
	}
	private static boolean isPrime(int num){
		if(num==2){
			return true;
		}
		if(num%2==0){
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++){
			 if(num%i==0){
				 return false;
			 }
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(primeSum(28));
	}
}
