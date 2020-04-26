package abhi.prac1.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
/**
 * add/addFirst/addLast/add to index
 * remove/remove index/ remove object
 * getFirst/getLast
 * element
 */
public class LinkedListOperation1 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>(Arrays.asList("Orange", "Banana", "Apple"));
		linkedList.add("Strawberry");
		linkedList.addLast("Pineapple");
		linkedList.addFirst("Watermelon");
		linkedList.add(2, "Mango");
		System.out.println(linkedList);
		linkedList.remove(); //remove first element
		System.out.println(linkedList);
		linkedList.remove(4);
		linkedList.remove("Apple");
		System.out.println(linkedList);
		System.out.println("First = " + linkedList.getFirst());
		System.out.println("Last = " + linkedList.getLast());
		System.out.println("element = " + linkedList.element()); //retrieve first element don't remove
		linkedList.clear();
		
	}
}
