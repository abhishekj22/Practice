package abhi.prac1.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * Loop
 * Foreach/keyset/iterator
 */
public class HashMapOperation2 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(10, "Amit");		hm.put(14, "Abhishek");
		hm.put(54, "Tracy");	hm.put(33, "Himmat");
		hm.put(49, "Jessy");	hm.put(22, "Andrew");
		
		for(Entry<Integer, String> entry: hm.entrySet()) {
			System.out.print(entry.getKey() + " -> " + entry.getValue() + "  ");
		}
		System.out.println();
		
		for(Integer i : hm.keySet()) {
			System.out.print(i);
			System.out.print(" -- " + hm.get(i) + "  ");
			
		}
		System.out.println();
		
		Iterator<Entry<Integer, String>> itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.print(entry.getKey() + " >> " + entry.getValue() + "  ");
		}
		
		

	}
}
