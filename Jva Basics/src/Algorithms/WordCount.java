package Algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WordCount {

	public static void main(String[] args) {
		/*
		 * Scanner in = new Scanner(System.in); String s = in.next(); char[]
		 * ch=s.toCharArray(); int count=0; for(int i=0;i<ch.length;i++){ if(
		 * Character.isUpperCase(ch[i])){ count++; } }
		 * System.out.println(count);
		 */
		int a[] = { 14, 31, 0, 7, 'c' };
		WordCount.swap_array(a);

	}

	static void swap_array(int[] a) {
		class binary {

			int numberofone(int number) {
				int numberofones = 0;
				while (number > 0) {
					if (number % 2 == 1) {
						numberofones++;
					}
					number = number / 2;
				}

				return numberofones;
			}
		}
		;
		binary b = new binary();

		if (a.length == 1) {
			System.out.print(a[0]);
		}

		else {
			for (int i = 1; i < a.length; i++) {
				if (Character.isDigit(a[i])) {
					if (b.numberofone(a[i - 1]) < b.numberofone(a[i])) {

						int temp = a[i - 1];
						a[i - 1] = a[i];
						a[i] = temp;
					}
				}

			}
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		}
	}
}