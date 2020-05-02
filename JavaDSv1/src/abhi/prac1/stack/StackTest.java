package abhi.prac1.stack;

public class StackTest {

	public static void main(String[] args) {
		Stack s = new Stack(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.pop();
		s.pop();
		System.out.println(s.peek());
		s.push(50);
		s.push(60);
		System.out.println(s);
		System.out.println(s.search(20));
		System.out.println(s.search(30));

	}

}
