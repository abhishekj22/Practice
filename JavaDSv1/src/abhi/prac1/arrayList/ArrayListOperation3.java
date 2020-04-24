package abhi.prac1.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;

/**
 * remove duplicates using
 * 1. Set
 * 2. Loop
 * Reverse list using 
 * 1. List iterator
 * 2. Get Set Method
 */
public class ArrayListOperation3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(20, 40, 10, 30, 90, 50, 40, 20));
		System.out.println("Before removeDuplicatesUsingSet = " + list);
		removeDuplicatesUsingSet(list);
		System.out.println("After removeDuplicatesUsingSet = " + list);
		System.out.println("----------------------------------------------------------------------");
		list = new ArrayList<Integer>(Arrays.asList(20, 40, 10, 30, 90, 50, 40, 20));
		System.out.println("Before removeDuplicatesUsingLoop = " + list);
		list = removeDuplicatesUsingLoop(list);
		System.out.println("After removeDuplicatesUsingLoop = " + list);
		System.out.println("----------------------------------------------------------------------");
		list = new ArrayList<Integer>(Arrays.asList(20, 40, 10, 30, 90, 50, 40, 60));
		System.out.println("Before reverse UsingListIterator = " + list);
		list = reverseAListUsingListIterator(list);
		System.out.println("After reverse UsingListIterator = " + list);
		System.out.println("----------------------------------------------------------------------");
		list = new ArrayList<Integer>(Arrays.asList(20, 40, 10, 30, 90, 50, 40, 60));
		System.out.println("Before reverse Using GetSet = " + list);
		reverseAListUsingGetSet(list);
		System.out.println("After reverse Using GetSet = " + list);
	}

	public static void removeDuplicatesUsingSet(ArrayList<Integer> list) {
		Set<Integer> set = new LinkedHashSet<Integer>(list); // will remove duplicates and maintain order
		list.clear();
		list.addAll(set);
	}
	
	// O(n)
	public static ArrayList<Integer> removeDuplicatesUsingLoop(ArrayList<Integer> list) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(Integer i : list) {
			if(!arrayList.contains(i)) {
				arrayList.add(i);
			}
		}
		return arrayList;
	}
	
	//O(n)
	public static ArrayList<Integer> reverseAListUsingListIterator(ArrayList<Integer> list) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ListIterator<Integer> itr = list.listIterator(list.size());
		while(itr.hasPrevious()) {
			arrayList.add(itr.previous());
		}
		return arrayList;
	}
	
	//O(n/2)
	public static void reverseAListUsingGetSet(ArrayList<Integer> list) {
		for(int i = 0, j = list.size()-1; i < list.size() >> 1; i++, j--) {
			int f = list.get(i);
			list.set(i, list.get(j));
			list.set(j, f);
		}
	}
}
