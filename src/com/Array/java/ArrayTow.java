package com.Array.java;

public class ArrayTow {

	public static void main(String[] args) {
		int[] a = { 10, 2, 40, 50 };
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {

				min = a[i];
			}

		}System.out.println(min);
		

	}

}
