import java.util.ArrayList;

public class Intersection {
	static ArrayList<Integer> intersection(ArrayList<Integer> a,ArrayList<Integer> b) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = 0, m = 0;
		while (n < a.size() && m < b.size()) {
			if (a.get(n) < b.get(m)) {
				n++;
			} else if (a.get(n) > b.get(m)) {
				m++;
			} else {
				list.add(a.get(n));
				m++;
				n++;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(10);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(2);
		b.add(3);
		b.add(5);
		b.add(6);
		b.add(10);
		System.out.println(intersection(a, b));
	}
}
