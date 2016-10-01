package datastructure;

import java.util.Scanner;

class TreeNode {
	TreeNode left;
	TreeNode right;
	int data;

	public TreeNode() {
		// TODO Auto-generated constructor stub
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}

public class TreeTraversal {
	private TreeNode node;

	public TreeTraversal() {
		node = null;
	}

	TreeNode insert(TreeNode treenode, int value) {
		TreeNode node = new TreeNode();
		if (treenode == null) {
			node.setData(value);
			node.setLeft(null);
			node.setRight(null);
			treenode = node;
		}
		if (value < treenode.getData()) {
			insert(treenode.left, value);

		} else if (value > treenode.getData()) {
			insert(treenode.right, value);
		}

		return node;
	}

	public static void main(String[] args) {
		TreeTraversal treeTraversal = new TreeTraversal();
		Scanner scr = new Scanner(System.in);
		int value;
		System.out.println("Enter -1 to stop");

		int ch = -1;
		do {
			TreeNode treenode = null;
			System.out.println("Enter the value of node");
			value = scr.nextInt();
			treeTraversal.insert(treenode, value);
		} while (ch == -1);

	}

}
