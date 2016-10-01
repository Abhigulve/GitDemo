package Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class Diamond {
	/*
	 * static void StairCase(int n) { int i,j,k;
	 * 
	 * for( k=1;k<=n;k++){
	 * 
	 * for(i=0;i<n-k;i++){
	 * 
	 * System.out.print(" "); }
	 * 
	 * for( j=0;j<k;j++){ System.out.print("#"); } System.out.println(); }
	 * 
	 * }
	 */
	
	
	/*static	int   getbinary(int num) {
		int count = 0, cousetive_ones = -9999;
		while (num > 0) {
			if (num % 2 == 1) {
				count++;
			} else {
				count = 0;
			}
			if (count > cousetive_ones) {
				cousetive_ones = count;
			}
			
			num=num/2;
		}
		return cousetive_ones;
	}
*/
	public static  int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int numberofcoOrdinates=X.size(),ans=0;
        if(numberofcoOrdinates==0){
        	return 0;
        }
        for(int i=1;i<numberofcoOrdinates;i++)
        if(Math.abs(X.get(i)-X.get(i-1))>Math.abs(Y.get(i)-Y.get(i-1))){
            
        	ans=ans+Math.abs(X.get(i)-X.get(i-1));
        	
        }else{
        	ans=ans+Math.abs(Y.get(i)-Y.get(i-1));
        }
		return ans;
        
    }
	public static void main(String[] args) {
		/*
		 * Scanner in = new Scanner(System.in); int n = in.nextInt();
		 */
	//	System.out.println(getbinary(13));
		
		ArrayList<Integer>X=new ArrayList<Integer>();
		ArrayList<Integer>Y=new ArrayList<Integer>();
		X.add(1);
		Y.add(1);
		X.add(4);
		Y.add(5);
		X.add(7);
		Y.add(6);
		System.out.println(coverPoints(X,Y));
	}
}
