package abhi.prac1.stack;

import java.util.Arrays;

public class Stack {
	private int arr[];
	private int top;
	
	Stack(){
		this(10);
	}
	
	Stack(int size){
		arr = new int[size];
		top = 0;
	}
	
	public void push(int data) {
		if(isFull())
			throw new IllegalStateException();
		
		arr[top++] = data;
	}
	
	public int pop() {
		if(isEmpty())
			throw new IllegalStateException();
		
		return arr[top--];
	}
	
	public int peek() {
		if(isEmpty())
			throw new IllegalStateException();
		
		return arr[top-1];
	}
	
	public int search(int data) {
		for(int i=0; i<top;i++) {
			if(data == arr[i])
				return i;
		}
		
		return -1;
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	private boolean isFull() {
		return top == arr.length;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		for(int i=top-1; i>=0;i--) {
			sb.append(arr[i] + ", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append(" ]");
		return sb.toString();
	}
}
