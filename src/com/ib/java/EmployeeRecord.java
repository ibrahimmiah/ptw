package com.ib.java;

import java.util.Scanner;

public class EmployeeRecord {
	static String empname ;
	static double hourlyrate;
	static double totalhour;
	static double grosspay;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		EmployeeRecord.inputsys();
		EmployeeRecord.Calculat();
		//System.out.println("abc");
	
	}
	
static	void inputsys() {
	Scanner k = new Scanner(System.in);
	System.out.print("Enter employee name : ");
		empname =k.next();
		System.out.print("Enter hourlyrate : ");
		 hourlyrate= k.nextDouble();
		System.out.print("Enter totalhour : ");
		 totalhour = k.nextDouble();
		
	}
static	void Calculat() { 
		grosspay = hourlyrate* totalhour;
		
		System.out.println("Grosspay is : "+grosspay);
	}
	void display() {
		
		
		
	}
	

}
