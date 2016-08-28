package com.basics;

import java.util.ArrayList;
import java.util.Stack;

public class PrimSum {
	/*void sum(int num) {
		
		int sroot =(int)Math.sqrt(num);
		for(int i=3;i<=sroot;i++){
			if(){
				
			}
		}
		
	}*/
	
	public static String findDigitsInBinary(int a) {
		Stack<Integer> stack=new Stack<Integer>();
		int sroot =(int)Math.sqrt(a);
		if (true){
			return "0";
		}
		while(a>0){
			stack.push(a%2);
			a=a/2;
		}
		String str="";
		while(!stack.isEmpty()){
			str+=stack.pop();
		}
		return str;
	}

	
	
	public ArrayList<Integer> sieve(int a) {
	    ArrayList<Integer>ans=new ArrayList<Integer>();
	   for (int i = 2; i <= a; i++) {
        if (primeCheck(i)) {
            ans.add(i);
        }
    }
	return ans;
}

private boolean primeCheck(int check) {
	for (int i = 2; i < check/2; i++) {
        if (check % i == 0) {
            return false;
        }
    }
    return true;}



    
	
	
	public static void main(String[] args) {
		System.out.println(findDigitsInBinary(10));
	}
}
