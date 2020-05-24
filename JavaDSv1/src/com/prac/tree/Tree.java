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
