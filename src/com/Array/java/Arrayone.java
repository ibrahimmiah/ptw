package com.Array.java;

public class Arrayone {
	private static char[] x;

	public static void main(String[] args) {

		int[] a = {29, 5, 100, 20 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];
				
			}
			
		}System.out.println(max);

	}

}
