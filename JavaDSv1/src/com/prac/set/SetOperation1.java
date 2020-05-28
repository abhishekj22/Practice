package com.prac.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * add / remove 
 * contains/ isEmpty/ size
 * iterator
 */
public class SetOperation1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Mumbai");
		set.add("Bangalore");
		set.add("Hydrabad");
		set.add("New York");
		set.add("Mumbai");
		System.out.println(set);
		set.remove("Hydrabad");
		System.out.println(set);
		System.out.println(set.contains("Mumbai"));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		Iterator<String> itr =  set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
