import java.util.ArrayList;

public class FindMissingNumber {
	 public static int firstMissingPositive(ArrayList<Integer> A) {
	        int len = A.size();
	        
	        for (int i = 0; i < len; i++) {
	            // swap until A[i] == i + 1 or we met non-positive number
	            while (A.get(i) != (i + 1) || A.get(i) <= 0) {
	                // swap A[i] with A[A[i] - 1]
	                int num = A.get(i);
	                int targetIndex = num - 1;
	                // watch here ! test index within boundary first
	                if ((targetIndex < 0 || targetIndex >= len) || num == A.get(num - 1)) {
	                    // duplicated number
	                    break;
	                }
	                // swap
	                A.set(i, A.get(num - 1));
	                A.set(num - 1, num);
	            }
	        }
	        // find the missing integer
	        for (int i = 0; i < len ; i++) {
	            if (A.get(i) != i + 1) {
	                // found missing
	                return i + 1;
	            }
	        }
	        // no missing number
	        return len + 1;
	    }


	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(-1);
		list.add(1);
		System.out.println(firstMissingPositive(list));
	}
}
