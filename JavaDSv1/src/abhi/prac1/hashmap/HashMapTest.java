package abhi.prac1.hashmap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "Abhi");
		hm.put(2, "Loren");
		hm.put(3, "Jack");
		hm.put(4, "Joe");
		hm.put(5, "Vasie");
		hm.put(6, "Pasta");
		hm.put(2, "Lanny");
		System.out.println(hm.get(5));
		hm.remove(5);
		System.out.println(hm);
		hm.put(5, "Rimmy");
		System.out.println(hm);

	}
}
