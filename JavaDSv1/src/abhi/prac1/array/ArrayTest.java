package abhi.prac1.array;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int arr[] = generateArray();
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int[] generateArray() {
		int arr[] = new int[10];
		arr[0] = 1;
		for(int i = 1; i < 10; i++) {
			arr[i] =  (int) (Math.random() * 100D);
		}
		return arr;
	}
}
