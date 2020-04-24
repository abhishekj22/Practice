package abhi.prac1.array;

import java.util.Arrays;

public class RotateAray {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		rotateArray(arr, 6);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void rotateArray(int[] arr, int elem) {
		int temp[] = new int[elem];
		for(int i =0; i < elem; i++) {
			temp[i] = arr[i];
		}
		for(int i =0, j = elem; j< arr.length; i++, j++) {
			arr[i] = arr[j];
		}
		for(int i =0, j = arr.length-elem; j< arr.length; i++, j++) {
			arr[j] = temp[i];
		}
	}

}
