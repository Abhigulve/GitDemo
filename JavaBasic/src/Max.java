import java.util.List;


public class Max {
	
		// DO NOT MODIFY THE LIST
		int max(int x, int y) 
	    {
	        return x > y ? x : y;
	    }
	 
	    int min(int x, int y) 
	    {
	        return x < y ? x : y;
	    }
		public int maximumGap(final List<Integer> a) {
		     int maxDiff;
	        int i, j;
	 
	        int RMax[] = new int[a.size()-1];
	        int LMin[] = new int[a.size()-1];
	 
	        /* Construct LMin[] such that LMin[i] stores the minimum value
	           from (arr[0], arr[1], ... arr[i]) */
	        LMin[0] = a.get(0);
	        for (i = 1; i < a.size(); ++i)
	            LMin[i] = min(a.get(i), LMin[i - 1]);
	 
	        /* Construct RMax[] such that RMax[j] stores the maximum value
	           from (arr[j], arr[j+1], ..arr[n-1]) */
	        RMax[a.size() - 1] = a.get(a.size() - 1);
	        for (j = a.size() - 2; j >= 0; --j)
	            RMax[j] = max(a.get(j), RMax[j + 1]);
	 
	        /* Traverse both arrays from left to right to find optimum j - i
	           This process is similar to merge() of MergeSort */
	        i = 0; j = 0; maxDiff = -1;
	        while (j < a.size() && i < a.size()) 
	        {
	            if (LMin[i] <= RMax[j]) 
	            {
	                maxDiff = max(maxDiff, j - i);
	                j = j + 1;
	            } 
	            else
	                i = i + 1;
	        }
	 
	        return maxDiff;
		    
		}
	}


