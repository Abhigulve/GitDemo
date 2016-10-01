package datastructure;

import java.util.Stack;

class node {
	int data;
	node next;

	public node() {
		// TODO Auto-generated constructor stub
	}

	public node(int data) {
		this.data = data;
		next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public node getNext() {
		return next;
	}

	public void setNext(node next) {
		this.next = next;
	}

}

public class LinkedList {
	int count = 0;
	node head = null;

	void insertData(int data) {
		node p = head;
		node node = new node(data);
		if (head == null) {
			head = node;
			count++;
		} else {

			while (p.getNext() != null) {
				p = p.getNext();
			}
			p.setNext(node);
			count++;
		}
	}

	// ////////////////////////////////////////////////////////////////////////////

	node Insert(node head, int data) {
		node p = head;
		node node = new node();
		node.data = data;
		node.next = null;
		if (head == null) {
			return node;
		} else {
			while (p.next != null) {
				p = p.next;
			}
			p.next = node;
			return p;
		}
	}

	int get(int index) {
		node p = head;

		if (index <= 0) {
			return -1;
		} else {
			for (int i = 1; i < index; i++) {
				p = p.getNext();
			}
			return p.getData();
		}
	}

	/*
	 * node Insert(node head1,int data) {
	 * 
	 * node p = head; node node=new node(); node.data=data; node.next=null; if
	 * (head==null) { return node; } else { while(p.next!=null) { p = p.next; }
	 * p.next=node; return node; } }
	 */

	node InsertNth(node head, int data, int position) {
		// This is a "method-only" submission.
		// You only need to complete this method.

		node p = head;
		node n = new node();
		n.data = data;
		n.next = null;
		int count = 0;

		if (position == 0) {
			if (head == null) {
				head = n;
				return head;
			} else {
				n.next = head;
				head = n;
				return head;
			}
		} else {
			for (int i = 1; i < position; i++) {
				p = p.next;
			}
			n.next = p.next;
			p.next = n;
			return head;
		}
	}

	int remove(int index) {
		node p = head;
		if (index <= 0) {
			return -1;
		} else {
			for (int i = 1; i < index - 1; i++) {
				p = p.getNext();
			}
			p.setNext(p.getNext().getNext());
			p.getNext().setNext(null);
			return 0;
		}
	}

	void ReversePrint(node head) {
		Stack<Integer> stack = new Stack<Integer>();
		node p = head;
		while (p.next != null) {
			stack.push(p.data);
			p = p.next;
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}
	
	int CompareLists(node headA, node headB) {
		   node p1=headA;
		   node p2=headB;
		    int flag=0,count=0;
		   
		    while(p1.next!=null ){
		       
		         if (p1.next!=null && p2.next==null ||(p2.next!=null && p1.next==null)){
		           return 0; 
		       }
		        if(p1.data==p2.data){
		       p1=p1.next;
		       p2=p2.next;
		       flag=1;
		       continue;
		       }else{
		           return 0;
		       }
		                 
		   }
		    if(flag==1) {return 1;};
			return 0;
		}


	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4 };
		for (int i = 4; i >= 0; i--) {
			System.out.print(array[i] + " ");

		}
	}
}
