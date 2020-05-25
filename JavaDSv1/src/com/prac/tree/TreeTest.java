package com.prac.tree;

public class TreeTest {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(20);
		tree.insert(10);
		tree.insert(30);
		tree.insert(6);
		tree.insert(14);
		tree.insert(24);
		tree.insert(3);
		tree.insert(8);
		tree.insert(26);
		System.out.println(tree.find(14));
		tree.preOderTraversal();
		System.out.println();
		tree.inOrderTraversal();
		System.out.println();
		tree.postOrderTraversal();
	}
}
