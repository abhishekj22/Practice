package abhi.prac1.arrayList;


public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(10);
		arr.add(90);
		arr.add(30);
		arr.add(80);
		arr.add(50);
		arr.add(70);
		arr.add(60);
		arr.add(50);
		arr.add(70);
		arr.add(40);
		System.out.println(arr);
		arr.remove(9);
		System.out.println(arr.contains(70));
		System.out.println(arr);

	}

}
