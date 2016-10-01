package Algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/*
*Author @Abhijeet Gulve
*/

public class HotelBookng {
//copy from here to last;
	class Interval implements Comparable<Interval> {
		int a;
		int d;

		public Interval(int a, int d) {
			this.a = a;
			this.d = d;
		}
// Sorted according to the arrival as departure and  arrival both interdependent so we have to sort only arrival. 
		public int compareTo(Interval that) {
			return this.a - that.a;
		}
	}
	public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart,
			int K) {
		if (arrive == null || arrive.size() == 0 || depart == null
				|| depart.size() == 0 || depart.size() != arrive.size()
				|| K < 1)
			return false;
		K--;

		Interval[] intervals = new Interval[arrive.size()];
		for (int i = 0; i < arrive.size(); i++) {
			intervals[i] = new Interval(arrive.get(i), depart.get(i));
		}
		
		Arrays.sort(intervals);
		for (int i = 1; i < arrive.size(); i++) {
			if (K > 0) {
				K--;
				continue;
			}
			if (arrive.get(i) < depart.get(i - 1)) {
				return false;
			}
		}
		return true;
	}
//////////////////////////////////////////////////////////////////////////
	/*
	* I don't know this method is present or not so please check for that.
	* if this is available then paste this as well 
	*
	*/
	   public boolean hotelEfficient(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
	         if(arrive == null || arrive.size() == 0||
	           depart == null || depart.size() == 0 ||
	           depart.size() != arrive.size() || K < 1)
	            return false;
	         
	         Collections.sort(arrive);
	         Collections.sort(depart);
	         System.out.println("Arrive : " + arrive);
	         System.out.println("Depart : " + depart);
	         int aIndex = 0;
	         int dIndex = 0;
	         
	         int currentRooms = 0;
	         int max =0;
	         while(aIndex < arrive.size()){
	             if(arrive.get(aIndex) < depart.get(dIndex)) {
	                 aIndex++;
	                 currentRooms++;
	                 max = Math.max(max, currentRooms);
	             }
	             else {
	                 dIndex++;
	                 currentRooms--;
	             }
	         }
	         System.out.println("max : " + max);
	         return max <= K;
	    }
	
}
