package com.prac.tree;

public class TreeTest {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(5);
		tree.insert(15);
		tree.insert(6);
		tree.insert(1);
		tree.insert(8);
		tree.insert(12);
		tree.insert(18);
		tree.insert(17);
		System.out.println(tree.find(15));
	}
}
