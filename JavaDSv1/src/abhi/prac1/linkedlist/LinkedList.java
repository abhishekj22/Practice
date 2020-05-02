package abhi.prac1.linkedlist;

public class LinkedList {
	private Node head;
	private int size = 0;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(!isEmpty()) {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}else
			head = newNode;
		size++;
	}
	
	public void removeFirst() {
		if(isEmpty())
			throw new IllegalStateException();
		
		Node temp = head;
		head = head.next;
		temp = null;
		size--;
	}
	
	public void removeLast() {
		if(isEmpty())
			throw new IllegalStateException();
		
		Node temp = head.next;
		Node prev = head;
		if(temp != null) {
			while(temp.next != null) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = null;
			temp = null;
		}else {
			head = null;
		}
		size--;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node temp = head;
		while(temp != null) {
			sb.append(temp.data + ", ");
			temp = temp.next;
		}
		if(head != null)
			sb.delete(sb.length()-2, sb.length());
		sb.append("]");
		return sb.toString();
	}

	class Node{
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
}
