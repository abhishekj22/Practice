package com.prac.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hashset
 * LinkedListSet
 * TreeSet
 */
public class SetOperation2 {
	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<Integer>(Arrays.asList(10, 90, 20, 30, 5, 1, 80, 50, 45));
		hs.add(70);
		hs.add(25);
		System.out.println("HashSet: " + hs);
		//maintain insertion order
		Set<Integer> ls = new LinkedHashSet<Integer>(Arrays.asList(10, 90, 20, 30, 5, 1, 80, 50, 45));
		ls.add(70);
		ls.add(25);
		System.out.println("LinkedListSet: " + ls);
		//sorted
		Set<Integer> ts = new TreeSet<Integer>(hs);
		ts.add(65);
		System.out.println("TreeSet: " + ts);
	}

}
