package com.prac.tree;

public class AVLTree {
	private AVLNode root;
	
	public void insert(int data) {
		AVLNode newLeaf = new AVLNode(data);
		root = insert(root, newLeaf);
	}
	
	private AVLNode insert(AVLNode node, AVLNode newLeaf) {
		if(node == null) {
			node = newLeaf;
			return newLeaf;
		}
		
		if(newLeaf.data < node.data) {
			node.leftSubtree =insert(node.leftSubtree, newLeaf);
		} else {
			node.rightSubtree = insert(node.rightSubtree, newLeaf);
		}
		
		setHeight(node);
		
		return balance(node);
	}
	
	private AVLNode balance(AVLNode node) {
		if(isLeftHeavy(node)) {
			if(balanceFactor(node.leftSubtree) < 0)
				node.leftSubtree = rotateLeft(node.leftSubtree);
			return rotateRight(node);
		}
		else if(isRightHeavy(node)) {
			if(balanceFactor(node.rightSubtree) > 0)
				node.rightSubtree = rotateRight(node.rightSubtree);
			return rotateLeft(node);
		}
		
		return node;
	}
	
	private AVLNode rotateRight(AVLNode node) {
		AVLNode newRoot = node.leftSubtree;
		
		node.leftSubtree = newRoot.rightSubtree;
		newRoot.rightSubtree = root;
		
		setHeight(node);
		setHeight(newRoot);
		return newRoot;
	}
	
	private AVLNode rotateLeft(AVLNode node) {
		AVLNode newRoot = node.rightSubtree;
		
		node.rightSubtree = newRoot.leftSubtree;
		newRoot.leftSubtree = root;
		
		setHeight(node);
		setHeight(newRoot);
		return newRoot;
	}
	private void setHeight(AVLNode node) {
		node.height = Math.max(height(node.leftSubtree), height(node.rightSubtree)) + 1;
	}
	
	private int balanceFactor(AVLNode node) {
		return node == null? 0: height(node.leftSubtree) - height(node.rightSubtree);
	}
	
	private boolean isLeftHeavy(AVLNode node) {
		return balanceFactor(node) > 1;
	}
	
	private boolean isRightHeavy(AVLNode node) {
		return balanceFactor(node) < -1;
	}
	
	private int height(AVLNode node) {
		return node == null? -1 : node.height;
	}
	
	/*
	 * public int countHeight() { return countHeight(root); }
	 * 
	 * private int countHeight(AVLNode node) { if(node == null) return -1;
	 * 
	 * if (node.leftSubtree == null && node.rightSubtree == null) return 0;
	 * 
	 * return 1 + Math.max(countHeight(node.leftSubtree),
	 * countHeight(node.rightSubtree));
	 * 
	 * }
	 */
	
	
	
	class AVLNode{
		int data;
		AVLNode leftSubtree;
		AVLNode rightSubtree;
		int height;
		
		public AVLNode(int data) {
			this.data = data;
			leftSubtree= null;
			rightSubtree = null;
		}
	}

}
