package com.prac.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Set Operations
 * UnionAll: Set A + Set B - All elements from both set
 * Intersect: Common Value from both Set
 * Difference: Set A - Set B: remove/minus values from Set
 * Subset: Another set contains all the Elements 
 * @author abhishek.jagtap
 *
 */
public class SetOperation3 {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 10, 70, 55, 33, 2, 60));
		Set<Integer> setB = new HashSet<>(Arrays.asList(1, 20, 70, 90, 33, 2));
		//UnionAll
		Set<Integer> setC = new HashSet<Integer>(setA);
		setC.addAll(setB);
		System.out.println("UnionAll: " + setC);
		setC = null;
		//Intersection
		setC = new HashSet<Integer>(setA);
		setC.retainAll(setB);
		System.out.println("Intersect: " + setC);
		setC = null;
		//Difference
		setC = new HashSet<Integer>(setA);
		setC.removeAll(setB);
		System.out.println("Difference: " + setC);
		//subset
		Set<Integer> setD = new HashSet<>(Arrays.asList(1, 10, 30));
		Set<Integer> setE = new HashSet<>(Arrays.asList(1, 10));
		System.out.println(setA.containsAll(setD));
		System.out.println(setA.containsAll(setE));
		
		
	}
}
