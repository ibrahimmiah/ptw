package com.Array.java;

import java.util.Scanner;

public class ArreyThree {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] num = new double[3];
		double sum = 0;
		System.out.print("Enter numbers : ");
		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextDouble();

			sum = sum + num[i];

		}
		System.out.println("sum is :" + sum);
		
		
		
		
		
		
	}
	
}
