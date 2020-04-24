package abhi.prac1.array;

import java.util.Arrays;

public class SmallestElementInArray {

	public static void main(String[] args) {
		int arr[] = {7, 10, 4, 3, 20, 15};
		System.out.print(KthSmallestElement(arr, 3));
		System.out.println(Arrays.toString(arr));

	}
	
	public static int KthSmallestElement(int arr[], int k) {
		int i = 0;
		for(int j = 0; j <= k ; j++) {
			for(i = 0; i < arr.length - 1 - j; i++) {
				//System.out.print(i + " ");
				if(arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			//System.out.println(" ");
		}
		return arr[k-1];
	}

}
