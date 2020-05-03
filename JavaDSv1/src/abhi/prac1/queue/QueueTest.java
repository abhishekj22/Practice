package abhi.prac1.queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(13);
		q.enqueue(12);
		q.enqueue(70);
		System.out.println(q);
		q.dequeue();
		q.dequeue();
		System.out.println(q);
	}
}
