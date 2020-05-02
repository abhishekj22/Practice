package abhi.prac1.linkedlist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListOperation3 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(10, 40, 60, 90, 20, 50));
		System.out.println(list);
		reverseLinkedListUsingStack(list);
		System.out.println(list);
		

	}

	public static LinkedList<Integer> reverseLinkedListUsingStack(LinkedList<Integer> list) {
		Stack<Integer> stack = new Stack<Integer>();
		for(Integer i : list)
			stack.push(i);
		list.clear();
		while(!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}
}
