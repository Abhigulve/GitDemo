package com.basics.string;

import java.util.Stack;

public class Palindrom {
	static int isPalindrom(String a){
		 String a1=a.toLowerCase();
		if(a.length()==0){
			return 0;
		}
		for(int i=0;i<a.length()/2;i++){
			if(Character.toUpperCase(a1.charAt(i))!=Character.toUpperCase(a1.charAt(a.length()-1-i))){
				return 0;
			}
		}
	return 1;	
	}
	
	
	
	public static int isPalindrome(String a) {
		a = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		 
		int len = a.length();
		if (len < 2)
			return 1;
	 
		Stack<Character> stack = new Stack<Character>();
	 
		int index = 0;
		while (index < len / 2) {
			stack.push(a.charAt(index));
			index++;
		}
	 
		if (len % 2 == 1)
			index++;
	 
		while (index < len) {
			if (stack.empty())
				return 0;
	 
			char temp = stack.pop();
			if (a.charAt(index) != temp)
				return 0;
			else
				index++;
		}
	 
		return 1;
        }
public static void main(String[] args) {
	System.out.println(isPalindrom("mada"));
}
}
