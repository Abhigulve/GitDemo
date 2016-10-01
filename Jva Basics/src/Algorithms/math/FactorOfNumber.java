package Algorithms.math;

import java.util.List;

public class FactorOfNumber {

	List<Integer> factorofnum(int num) {

		return null;

	}

	static int reverseint(int num) {
		boolean flag = false;
		
		if(num >2147483647 ){
			return 0;
		}
		else if(-2147483648<num){
		
			return 0;
		}
		
		if (num < 0) {
			num = 0 - num;
			flag = true;
		
		}
	 
		int res = 0;
		int p = num;
	 
		while (p > 0) {
			int mod = p % 10;
			p = p / 10;
			res = res * 10 + mod;
		}
	 
		if (flag) {
			res = 0 - res;
		}
	 
		return res;
	}
	boolean palindrom(int a){
		int result=0;
	while (a != 0) {
        result = result * 10 + (a % 10);
        a = a / 10;
    }
	if(result==a){
		return true;
	}
	return false;
	}

	public static void main(String[] args) {
System.out.println( reverseint( -1146467285));
	}
}
