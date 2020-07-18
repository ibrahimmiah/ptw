package com.ib.java;

import java.util.Scanner;

public class InputSystem {
	//static String empname;
	//static double hourlyrate;
	//static double totalHour;
	//static double grosspay;
	

	public Employee getinputofemployee() {
		Scanner myscan =new Scanner(System.in);
		Employee mrx = new Employee();
		System.out.println("Enter emp name : ");
	Employee.empname = myscan.nextLine();
	System.out.println(" Enter hourly rate : ");
	mrx.hourlyrate =myscan.nextDouble();
		System.out.println("Enter total hour : ");
	mrx.	totalHour = myscan.nextDouble();
	return mrx;
		
		
	}

	

}
