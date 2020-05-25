package com.prac.tree;

public class Tree {
	Node root;
	
	public void insert(int data) {
		if(root == null) 
			root = new Node(data);
		else
			insertNode(root, data);
	}
	
	public boolean find(int value) {
		Node temp = root;
		while(temp != null) {
			if(temp.data == value)
				return true;
			else if(temp.data > value) {
				temp = temp.leftNode;
			}else {
				temp = temp.rightNode;
			}
		}
		return false;
	}
	
	private void insertNode(Node node, int data) {
		Node temp = node;
		if(temp.data > data) {
			Node left = temp.leftNode;
			if(left == null)
				temp.leftNode = new Node(data);
			else
				insertNode(left, data);
		}else {
			Node right = temp.rightNode;
			if(right == null)
				temp.rightNode = new Node(data);
			else
				insertNode(right, data);
		}
	}
	
	public void preOderTraversal() {
		preOrderTraversal(root);
	}
	
	private void preOrderTraversal(Node node) {
		if(node == null)
			return;
		
		System.out.print(node.data + " ");
		preOrderTraversal(node.leftNode);
		preOrderTraversal(node.rightNode);
	}
	
	public void inOrderTraversal() {
		inOrderTraversal(root);
	}
	
	private void inOrderTraversal(Node node) {
		if(node == null)
			return;
		
		inOrderTraversal(node.leftNode);
		System.out.print(node.data + " ");
		inOrderTraversal(node.rightNode);		
	}
	
	public void postOrderTraversal() {
		postOrderTraversal(root);
	}
	
	private void postOrderTraversal(Node node) {
		if(node == null)
			return;
		
		postOrderTraversal(node.leftNode);
		postOrderTraversal(node.rightNode);
		System.out.print(node.data + " ");
				
	}
	
	public int countHeight() {
		return countHeight(root);
	}
	
	private int countHeight(Node node) {
		if (node == null)
			return -1;
		
		if (node.leftNode == null && node.rightNode == null)
			return 0;
		
		return 1 + Math.max(countHeight(node.leftNode), countHeight(node.rightNode));
	}
	

	class Node{
		int data;
		Node leftNode;
		Node rightNode;
		
		Node(int data){
			this.data = data;
			leftNode = null;
			rightNode = null;
		}
	}
}
