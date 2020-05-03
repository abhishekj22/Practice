package abhi.prac1.queue;

public class CircularQueue {
	private int q[];
	private int front;
	private int rear;
	int size;
	
	public CircularQueue() {
		q = new int[5];
		front = rear = -1;
	}
	
	public void enqueue(int data) {
		if(isFull())
			throw new IllegalStateException();
		
		rear = (rear + 1) % q.length;
		q[rear] = data;
		size++;
		
		if(front == -1)
			front = rear;
	}
	
	public int dequeue() {
		if(isEmpty())
			throw new IllegalStateException();
		
		int data = q[front];
		if(front == rear)
			front = rear = -1;
		else
			front = (front + 1) % q.length;		
		
		size--;
		return data;
		
	}
	
	@Override
	public String toString() {
		if(isEmpty())
			return "Queue is empty";
		
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		int i = front;
		if(front <= rear) {
			while(i<=rear)
				sb.append(q[i++] + ", ");
			
		}else {
			while(i <= q.length-1)
				sb.append(q[i++] + ", ");
			i=0;
			while(i<=rear)
				sb.append(q[i++] + ", ");
			
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append(" ]");
		return sb.toString();
	}
	
	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}
	
	private boolean isFull() {
		return size == q.length;
	}
}
