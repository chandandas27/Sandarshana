package com.java.concepts.polymorphism.methodoverriding;

// Method Overriding && Inheritance 
 class Employee {
	
	public void displayInfo() {
		System.out.println("This is Employee");
	}
}

 class Manager extends Employee{
	 
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("This is Manager");	
	}
	
	public void task() {
		System.out.println("I manage a team of employees");
	}
}


