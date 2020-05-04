package abhi.prac1.hashmap;

import java.util.HashMap;

/**
 * put/remove/putIfAbsent
 * compute/get
 */
public class HashMapOperation1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(10, "Amit");
		hm.put(14, "Abhishek");
		hm.put(54, "Tracy");
		hm.put(33, "Himmat");
		hm.put(49, "Jessy");
		System.out.println(hm);
		hm.put(54, "Andrew");
		System.out.println(hm);
		hm.remove(10);
		System.out.println(hm);
		hm.putIfAbsent(20, "Walter");
		System.out.println(hm);
		hm.compute(14, (k, v) -> v + ";");
		System.out.println(hm);
		System.out.println(hm.get(49));
	}

}
