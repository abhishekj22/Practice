package com.pracs;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array a = new Array(3);
		a.insert(10);
		a.insert(20);
		a.insert(30);
		a.insert(40);
		a.insert(50);
		a.removeAt(3);
		a.print();
		System.out.println(a.indexof(20));
		
	}

}
