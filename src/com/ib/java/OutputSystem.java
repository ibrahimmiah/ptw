package com.ib.java;

public class OutputSystem {
	static String empname;
	static double hourlyrate;
	static double totalHour;
	static double grosspay;
	

	public void generatePaycheck(Employee e) {
		System.out.println("Employee name is : "+e.empname);
		System.out.println("Hourly rate is : "+e.hourlyrate);
		System.out.println("Total Hour is : "+e.totalHour);
		System.out.println("Gross pay is : "+e.grosspay);
	}


}
