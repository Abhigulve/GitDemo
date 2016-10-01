package Algorithms.math;

import java.awt.geom.CubicCurve2D;

public class TrallingZeroAtFactorial {
/*	static long fact(int num){
		if(num==0){
		return 1;
	}else{
		System.out.print(".");
		
		return num*(fact(num-1));
	}
	}
	static int trailngzero(int num){
		int count=0;
	long  num1=fact(num);
		System.out.println(num);
		while(num1%10==0){
			count++;
			num1=num1/10;
		}
		
		return count;
	}
	*/
	
	
	
	static int  trailingzerowithbestlogic(int n){
		
		int count=0;
		for (int i = 5; n/i>=1; i*=5) {
			
				count+=n/i;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		//System.out.println(trailngzero(100));
		System.out.println(trailingzerowithbestlogic(11));
	}
}
