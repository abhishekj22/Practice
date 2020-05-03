package abhi.prac1.queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue-LinkedList
 * add/offer
 * remove/poll
 * element/peek
 * isEmpty/contains
 * iterator
 */
public class QueueOperation1 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>(Arrays.asList(10, 20, 90, 80));
		q.add(10); //throw exception
		q.add(50);
		q.offer(40); // return false if full
		System.out.println(q);
		q.remove(new Integer(10)); //throw exception
		q.poll(); //remove head else return null
		System.out.println(q);
		System.out.println(q.element()); //throw exception
		System.out.println(q.peek()); // return null;
		System.out.println(q.isEmpty());
		System.out.println(q.contains(20));
		
		Iterator<Integer> itr = q.iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println("");
		
	}
}
