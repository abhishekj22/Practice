package abhi.prac1.queue;

public class CircularQueueTest {
	public static void main(String[] args) {
		CircularQueue q = new CircularQueue();
		System.out.println(q.isEmpty());
		q.enqueue(10);
		q.dequeue();
		q.enqueue(20);
		q.enqueue(30);
		q.dequeue();
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.enqueue(70);
		q.dequeue();
		q.enqueue(90);
		System.out.println(q);
		System.out.println(q.isEmpty());
		
		
	}

}
