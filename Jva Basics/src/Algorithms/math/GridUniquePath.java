package Algorithms.math;

import java.util.ArrayList;

public class GridUniquePath {

	static int uniquePaths(int m, int n) {
		System.out.println(fact(m - 1));
		return (int) (fact(m + n - 2) / (fact(n - 1) * fact(m - 1)));
	}

	static long fact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}

	
	
	static int uniquePath(int A, int B) {
		long ans = 1;
		  // A+B-2 C A-1 = (A+B-2)! / (A-1)! (B-1)! 
		/*
		 * n!/r!(n-r)!
		 * When we have to calculate the combinations with less space complexity will use this method
		 * first we start with r so that it will directly cancel out the common elements 
		 * 
		 *  let n=6 r=4 then start for loop with 4+1 so that 1,2,3,4 get cancel out
		 *  after that we have to multiply with 4*5*6 and divide by 6-4 as 4 already get cancel out 
		 *  only ( 6-4 )! remained 
		 *  
		 *  it will be as the number of times that loop get run  1 ,1+1=2 means 1*2
		 *  will directly divide the elements simultaneously so 
		 * it will get reduce the space as well 
		 */
		int val=1;
		for (int i = A; i < (B + A - 1); i++) {
			ans *= i;
			ans /= val;
			val++;
		}
		return (int) ans;
	}

	ArrayList<Integer> bigNumber(int n) {

		return null;
	}

	public static void main(String[] args) {
		System.out.println(uniquePaths(100, 1));
		// System.out.println(uniquePath(3, 4));
	}
}
