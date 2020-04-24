package abhi.prac1.array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = {91, 15, 8, 1, 66};
		sortArray(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void sortArray(int arr[]) {
		int i = 0;
		for(int j = 0; j < arr.length ; j++) {
			for(i = 0; i < arr.length - 1 - j; i++) {
				System.out.print(i + " ");
				if(arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			System.out.println(" ");
		}
	}

}
