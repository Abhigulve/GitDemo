package Algorithms.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingIntervals {
	static List<Interval> mergeIntervals(ArrayList<Interval> list) {
		ArrayList<Interval> res = new ArrayList<Interval>();
		if ((list.size() == 0)) {
			return res;
		}
		Collections.sort(list,new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				
				return o1.getStart()-o2.getStart();
			}
		});
		res.add(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			if (res.get(res.size() - 1).end >= list.get(i).start) {
				res.get(res.size() - 1).setEnd(	Math.max(list.get(i).getEnd(), res.get(res.size() - 1).getEnd()));
			} else {
				res.add(list.get(i));
			}
		}
		return res;
	}

	public static void main(String[] args) {
ArrayList<Interval>list=new ArrayList<Interval>();

list.add(new Interval(2, 6));
list.add(new Interval(1, 3));
list.add(new Interval(8, 10));
System.out.println(mergeIntervals(list));
	}
}

class Interval {
	int start;
	int end;

	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}

	public Interval(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

}
