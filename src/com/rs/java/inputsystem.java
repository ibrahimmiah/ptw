package com.rs.java;

import java.util.Scanner;

public class inputsystem {
	double hourlyrate;
	 
public outputsystem  getinputofemployee() {
	Scanner myscan= new Scanner(System.in);
	outputsystem mrx = new outputsystem ();
	System.out.println(" \nEnter emp name : ");
    mrx.empname  =	myscan.next();
	System.out.println("Enter hourly rate :");
	 
	// s k = mm.
    mrx.hourlyrate = myscan.nextDouble();
    System.out.println("Enter total hour:");
    mrx.totalhour= myscan.nextDouble();
	System.out.println(" Enter grosspay : ");
	
	mrx.grosspay = myscan.nextDouble();
	return mrx;
	
}
}
