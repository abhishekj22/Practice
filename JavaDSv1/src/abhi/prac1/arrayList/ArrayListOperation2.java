package abhi.prac1.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Initialization with double brackets method
 * get()
 * contains()
 * Iterator
 * remove method while iterating
 * synchronized list
 * clear()
 * unmodifiable list
 * exception adding in unmodifiable list
 */
public class ArrayListOperation2 {
	public static void main(String[] args) {
		// This initialization is Anti-java double brackets pattern do not use
		ArrayList<String> arr = new ArrayList<String>() {{
			add("Kalyan");
			add("Bangalore");
			add("London");
			add("New York");
		}};
		System.out.println(arr);
		//get method
		System.out.println("get element at index 2 = " + arr.get(2));
		//contains method
		System.out.println(arr.contains("kalyan"));
		
		Iterator itr = arr.iterator();
		while(itr.hasNext()) {
			String str = (String) itr.next();
			if(str.equalsIgnoreCase("bangalore")) 
				itr.remove(); //if we use arr.remove(); it will throw error
			else
				System.out.print(str + "  ");
		}
		System.out.println(" ");
		
		/*
		 * for(String str : arr) { if(str.equals("Kalyan")) arr.remove(str); //error
		 * concurrent modification }
		 */
		//Synchronized list
		List<String> syncArr = Collections.synchronizedList(arr);
		System.out.println("Synchronized list = " + syncArr);
		//clear list
		syncArr.clear();
		System.out.println("After clearing list = " + syncArr);
		//unmodifiable list
		List<String> unmodifiableList = Collections.unmodifiableList(arr);
		//Exception on adding on unmodifiable list
		unmodifiableList.add("error");
	}
}
