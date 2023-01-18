package com.Arrays;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;

	}

}

class FindHieght {

	public static void order(Node root) {
		if (root != null)
		{
	    order(root.left);
		System.out.println(root.data + " ");
		order(root.right);
	}

	}

	public static int hieght(Node root) {
		if (root == null) {
			return 0;

		} else {
			int lh = hieght(root.left);
			int rh = hieght(root.right);
			return (lh < rh ? rh : lh) + 1;
		}
	}
}

public class Finding_the_Hieght {

	public static void main(String args[]) {
		Node root = null;
		root = new Node(20);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(80);
		root.left.right = new Node(84);
		root.right.left = new Node(45);
		root.right.right = new Node(48);

		System.out.println(FindHieght.hieght(root));
		FindHieght.order(root);
	}

}
