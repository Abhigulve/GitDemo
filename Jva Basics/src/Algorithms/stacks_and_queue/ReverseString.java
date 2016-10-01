package Algorithms.stacks_and_queue;

import java.util.Stack;

public class ReverseString {

	static String reverse(String str) {
		Stack<Character>stack=new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		String res="";
		for (int i = 0; i < str.length(); i++) {
			
			res+=stack.pop();
			
		}
		return res;
	}

	public static void main(String[] args) {
		
		System.out.println(reverse("abhijeet   ''''"));
	}
}
