package abhi.prac1.hashmap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class HashMap {
	private LinkedList<Entry>[] arr = new LinkedList[5];
	
	public void put(int key, String val) {
		int keyHash = hash(key);
		if(arr[keyHash] == null)
			arr[keyHash] = new LinkedList<HashMap.Entry>();
		
		if(!arr[keyHash].isEmpty()) {
			for(Entry e: arr[keyHash]) {
				if(e.key == key) {
					e.value = val;
					return;
				}
			}
		}
		
		arr[keyHash].add(new Entry(key, val));
		
	}
	
	public String get(int key) {
		int keyHash = hash(key);
		if(arr[keyHash] == null || arr[keyHash].isEmpty())
			return null;
		
		for(Entry e: arr[keyHash]) {
			if(e.key == key) {
				return e.value;
			}
		}
		
		return null;
	}
	
	public void remove(int key) {
		int keyHash = hash(key);
		
		if(arr[keyHash] == null || arr[keyHash].isEmpty())
			throw new IllegalStateException();
		
		Iterator<Entry> itr = arr[keyHash].iterator();
		while(itr.hasNext()) {
			Entry e = itr.next();
			if(e.key == key) {
				itr.remove();
			}
		}
	}
	
	private int hash(int key) {
		double k = key;
		return  (int) ((k * Math.PI) % 5);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
	
	class Entry{
		
		public Entry(int k, String v) {
			key = k;
			value = v;
		}
		
		int key;
		String value;
		
		@Override
		public String toString() {
			return key + " = " + value;
		}
	}

}
