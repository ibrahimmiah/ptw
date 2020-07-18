package com.rs.java;

public class Hr {
	public static void main(String[] args) {
		
		Hr p = new Hr();
		p.getEmployeeDetails();
		p.printpaychek();
	}
	
	private void getEmployeeDetails() {
		
		inputsystem k = new inputsystem();
		k.getinputofemployee();
		
		
	}
	private void printpaychek() {
		
		outputsystem j= new outputsystem();
		j.generatepaycheck();
		
	}

}
