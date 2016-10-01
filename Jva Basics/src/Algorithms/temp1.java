package Algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class temp1 {

	 public static void main(String args[] ) throws Exception {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		 
		 BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in)); 
	        String line; 

	        while ((line = stdin.readLine()) != null && line.length()!= 0) { 
	        	if(line.contains("//"))
	        	{
	        		 for (int i=line.indexOf("//")+1;i<line.length();i++){
		        		   System.out.print(line.charAt(i));
		        	   }
	        	}
	        	else  if (line.contains("/*")){
	        		
	        	   while(!(line.contains("*/"))){        		   
	        		line.indexOf("/*");
	        		
	        	   for (int i=line.indexOf("/");i<line.length();i++){
	        		   System.out.print(line.charAt(i));
	        		   
	        	   }
	           } 
	        }
	        } 

	 }
	 
	 
	 
}