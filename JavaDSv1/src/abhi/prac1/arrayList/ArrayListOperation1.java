package abhi.prac1.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * One line initialization
 * add element at end & at specific index
 * remove element at index & using object
 * size
 * sublist
 * set (replacing element)
 * sorting ascending & descending
 * @author abhishek.jagtap
 */
public class ArrayListOperation1 {
	public static void main(String[] args) {
		//One line initialization
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(11, 20, 13, 40, 25));
		//add elements
		arr.add(72);
		arr.add(7);
		//add elements at specific index
		arr.add(0, 99);
		//remove using index
		System.out.println("Removed element using index = " + arr.remove(2));
		//remove using element
		System.out.println("Removed element using element = " + arr.remove(new Integer(211)));
		// size of list
		System.out.println("size of array = " + arr.size());
		// sublist
		System.out.println("Sub list " + arr.subList(2, 4));
		System.out.println("Before changing element in list = " + arr);
		List subArr2 = arr.subList(2, 4);
		//replacing element
		arr.set(2, 300);
		System.out.println("After changing element in list = " + arr);
		System.out.println("SubList Changed = " + subArr2);
		// sorting ascending
		Collections.sort(arr);
		System.out.println("After sorting = " + arr);
		//descending sorting
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println("Reverse sorting = " + arr);
	}
}
