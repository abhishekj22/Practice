package abhi.prac1.linkedlist;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("LinkedList: " + list);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("LinkedList: " + list);
		System.out.println("Size of Linked List: " + list.size());
		list.removeFirst();
		list.removeFirst();
		System.out.println("Size of Linked List: " + list.size());
		list.removeLast();
		list.removeLast();
		System.out.println("LinkedList: " + list);
		System.out.println("Size of Linked List: " + list.size());
	}

}
