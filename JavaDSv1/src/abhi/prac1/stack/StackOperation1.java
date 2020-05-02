package abhi.prac1.stack;

import java.util.Iterator;
import java.util.Stack;

/**
 * push/ pop/ peek 
 * search
 * stream foreach/ iterator
 */
public class StackOperation1 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		//Push
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		System.out.println(stack);
		//Pop
		System.out.println("Element removed = " + stack.pop());
		//peek
		System.out.println("Element at top = " + stack.peek());
		System.out.println(stack);
		//search
		System.out.println("30 int position= " + stack.search(30));
		System.out.println("Steam for each");
		stack.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println("iterator");
		Iterator<Integer> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

}
