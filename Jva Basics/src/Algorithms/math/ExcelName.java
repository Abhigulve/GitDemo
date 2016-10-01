package Algorithms.math;

import java.util.HashMap;

public class ExcelName {
	public static  String getName(int a){
		/*char[] array=new char[100];
		int i=0;
		while(a>0){
			int rem=a%26; 
			if(rem==0){
				array[i++]='Z';
				a=(a/26)-1;
			}else {
				array[i++]=(char) ((rem-1)+'A');
				a=a/26;
			}
		}
		
		
		return String.copyValueOf(array); */
		
		
		 int BASE = 26; 
		     
		      int START = 1; 

		 StringBuilder strBuilder = new StringBuilder(); 
		         while (a != 0) { 
		            strBuilder.insert(0, (char) ((a - START) % BASE + 'A')); 
		         a = (a - START) / BASE; 
		        } 
		       return strBuilder.toString(); 

		
	}

		public static int titleToNumber(String a) {
			if(a.length()==0){
				return 0;
			}
			  HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			    char c = 'A';
			    for(int i=1; i<=26; i++){
			        map.put(c, i);
			        c += 1; 
			    }
			 
			    int result = 0;
			    int i = a.length()-1;
			    int t = 0;
			    while(i >= 0){
			        char curr = a.charAt(i);
			        result = result + (int) Math.pow(26, t) * map.get(curr);
			        t++;
			        i--;
			    }
			 
			    return result;

		}
	

	
	public static void main(String[] args) {
		System.out.println(getName(980089));
		//System.out.println(titleToNumber("ZZ"));
	}
}
