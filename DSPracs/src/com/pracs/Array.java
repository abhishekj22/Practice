package com.pracs;

import java.util.Arrays;

public class Array {
	private int arr[];
	private int top = -1;
	private int capacity;

	Array(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
	}
	
	public void insert(int item) {
		top++;
		if(capacity > top) {
			arr[top] = item;
		}else {
			arr = Arrays.copyOf(arr, capacity*2);
			arr[top] = item;
		}
	}
	
	public void removeAt(int index) {
		/*
		 * int temp[] = arr; arr = Arrays.copyOfRange(arr, 0, index); arr =
		 * Arrays.copyOfRange(temp, index+1, top);
		 */
		if(index == top) {
			top--;
		}else {
			for(int i = index; i < top; i++) {
				arr[i] = arr[i+1];
			}
			top--;
		}
	}
	
	public void print() {
		for(int i = 0 ; i <= top; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public int indexof(int num) {
		for(int i =0; i<=top; i++) {
			if(arr[i] == num) {
				return i;
			}
		}
			
		return -1;
	}
}
