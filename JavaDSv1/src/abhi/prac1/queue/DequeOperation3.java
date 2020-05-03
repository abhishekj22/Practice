package abhi.prac1.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * ArrayDeque
 * addFirst/addLast
 * removeFirst/removeLast/poll
 * peekFirst/peekLast
 */
public class DequeOperation3 {
	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<Integer>(Arrays.asList(10, 20, 30, 90, 80, 70));
		System.out.println(dq);
		dq.addFirst(100);
		dq.addLast(5);
		System.out.println(dq);
		dq.removeFirst();
		dq.removeLast();
		System.out.println(dq.pollLast());
		System.out.println(dq);
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
	}
}
