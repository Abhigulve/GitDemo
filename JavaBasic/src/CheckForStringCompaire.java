import java.util.List;

public class CheckForStringCompaire {
	public String largestNumber(final List<Integer> a) {
		String[] NUM = new String[a.size()];
		for (int i = 0; i < a.size(); i++) {
			NUM[i] = String.valueOf(a.get(i));
		}
		java.util.Arrays.sort(NUM, new java.util.Comparator<String>() {
			public int compare(String left, String right) {
				String leftRight = left.concat(right);
				String rightLeft = right.concat(left);
				return rightLeft.compareTo(leftRight);
			}
		});
		java.lang.StringBuffer buffer = new java.lang.StringBuffer();
		for (int i = 0; i < NUM.length; i++) {
			buffer.append(NUM[i]);
		}
		java.math.BigInteger result = new java.math.BigInteger(
				buffer.toString());
		return result.toString();
	}
	public static void main(String[] args) {
		CheckForStringCompaire s = new CheckForStringCompaire();
	        {
	        }	
	}
}
