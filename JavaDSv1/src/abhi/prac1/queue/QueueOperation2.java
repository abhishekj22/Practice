package abhi.prac1.queue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * priority Queue
 * Normal add/ construct list / comparator
 * removal from queue
 * 
 */
public class QueueOperation2 {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(40);
		q.add(10);
		q.add(90);
		q.add(20);
		q.add(30);
		q.add(80);
		System.out.println(q);
		Queue<Integer> q2 = new PriorityQueue<Integer>(Arrays.asList(40,10,90,20,30,80));
		System.out.println(q2);
		Queue<Integer> q3 = new PriorityQueue<Integer>(new Comparator<Integer>() {
			//Descending
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 > o2)
					return -1;
				else if(o1 < o2)
					return 1;
				else
					return 0;
			};
		});
		q3.add(40);
		q3.add(10);
		q3.add(90);
		q3.add(20);
		q3.add(30);
		q3.add(80);
		System.out.println(q3);
		//------
		q.removeIf(a -> a > 50);
		System.out.println(q);
		q.remove();
		System.out.println(q);
	}
}
