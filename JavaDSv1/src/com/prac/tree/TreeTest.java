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
		tree.insert(1);
		tree.insert(8);
		tree.insert(26);
		System.out.println(tree.find(14));
		tree.preOderTraversal();
		System.out.println();
		tree.inOrderTraversal();
		System.out.println();
		tree.postOrderTraversal();
		System.out.println();
		System.out.println(tree.countHeight());
		System.out.println(tree.min());
		Tree tree2 = new Tree();
		tree2.insert(20);
		tree2.insert(10);
		tree2.insert(30);
		tree2.insert(6);
		tree2.insert(14);
		tree2.insert(24);
		tree2.insert(1);
		tree2.insert(8);
		tree2.insert(26);
		System.out.println(tree.equals(tree2));
		//tree.swapLeftRightChild();
		System.out.println(tree.isBinarySearchTree());
		tree.getNodeAtKDistance(3);
	}
}
