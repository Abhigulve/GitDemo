package Algorithms;

import java.io.*;



public class CandidateCode {
    void a(){
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String string="";
		try {
			string = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("Hello"+"Techgig");
	    System.out.println(string);
    
    }
   public static void main(String args[] ) throws Exception {
CandidateCode cad=new CandidateCode();
cad.a();
    
	//Write code here

   }
}
