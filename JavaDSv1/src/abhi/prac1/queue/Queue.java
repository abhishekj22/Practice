package abhi.prac1.queue;

public class Queue {
	private int q[];
	private int front;
	private int rear;
	private int size;
	
	Queue(){
		q = new int[10];
		front = rear = 0;
		size = 0;
	}
	
	public void enqueue(int data) {
		if(isFull()) 
			throw new IllegalStateException();
		
		q[rear++] = data;
		size++;
	}
	
	public int dequeue() {
		if(isEmpty()) 
			throw new IllegalStateException();
		
		int data = q[front++];
		size--;
		return data;
	}
	
	private boolean isFull() {
		return size == q.length;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		for(int i=front; i<rear; i++) {
			sb.append(q[i] + ", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append(" ]");
		return sb.toString();
	}

}
