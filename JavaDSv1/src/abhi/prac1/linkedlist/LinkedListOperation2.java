package abhi.prac1.linkedlist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
/**
 * offer/ offerFirst/ offerLast
 * peek/peekFirst/peekLast
 * poll/pollFirst/pollLast
 * pop / push
 * Iterator
 */
public class LinkedListOperation2 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>(Arrays.asList("Orange", "Banana", "Apple"));
		//offer = insert
		list.offerFirst("Mango");
		list.offer("Muskmelon");
		list.offerLast("Mosambi");
		System.out.println(list);
		//peek - retrieves but don't remove
		System.out.println("Peek = " + list.peek());
		System.out.println("Peek First = " + list.peekFirst());
		System.out.println("Peek Last = " + list.peekLast());
		System.out.println("Peek Last = " + list.peekLast());
		//poll - remove item from first
		System.out.println("Poll = " + list.poll());
		System.out.println("Poll last= " + list.pollLast());
		System.out.println("Poll first= " + list.pollFirst());
		System.out.println(list);
		//pop - remove first element
		System.out.println("pop = " + list.pop());
		//push - add to first
		list.push("Gauva");
		//Iterator
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			if(s.equals("Apple"))
				itr.remove();
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println(list);
		
	}
}
