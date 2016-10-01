package com.basics;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class MergeOverlappingIntervals {

	static List<Intervals> getOverlapIntervals(List<Intervals> list) {
		ArrayList<Intervals> res = new ArrayList<Intervals>();
		if (list.size() == 0) {
			return res;
		}
		res.add(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			if (res.get(res.size()-1).end >= list.get(i).start) {
				res.get(i - 1).setEnd(Math.max(res.get(res.size()-1).end, list.get(i).end));
			}else{
				res.add(list.get(i));
			}
		}
		return res;
	}

	public static void main(String[] args) {
		List<Intervals>intervalsList=new ArrayList<Intervals>();
		intervalsList.add(new Intervals(1,2));
		intervalsList.add(new Intervals(2,6));
		intervalsList.add(new Intervals(8,10));
	System.out.println(getOverlapIntervals(intervalsList));
	}
}

class Intervals {
	int start;
	int end;

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

	Intervals() {
		start = 0;
		end = 0;
	}

	@Override
	public String toString() {
		return "Intervals [start=" + start + ", end=" + end + "]";
	}

	public Intervals(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	
}