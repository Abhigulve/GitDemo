package com.basics;

public class Spiral_Matrix {
void printSpiral(int [][]array){
	int row=0;
	int col=0;
	int min_row=0,min_col=0;
	int size=(array.length*array[0].length);
	int[]spriral=new int[size];
	while(row<array.length && col<array[0].length){
		for( int i=0;i<(array[0].length-min_col);i++ ){
			spriral[i]=array[min_row][i];
		}
			
	}
	
	
}
	public static void main(String[] args) {
	
}
}
