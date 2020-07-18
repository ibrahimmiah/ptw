package com.ib.java;

public class Hr {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Hr tom = new Hr();
	    emp = tom.getEmployeeDetails();
		tom.printPaychek(emp);
		 
		
		
		Hr Bob = new Hr();
	    emp = Bob.getEmployeeDetails();
		Bob.printPaychek(emp);
		
		
	}

	public void printPaychek(Employee e) {
	OutputSystem print = new OutputSystem();
	print.generatePaycheck(e);
		
	}

	public Employee getEmployeeDetails() {
	InputSystem inputsystem = new InputSystem();
	return	inputsystem.getinputofemployee();
	}

	public void printPaychek(com.rs.java.Employee emp) {
		
		
	}

	
}
