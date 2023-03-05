package com.java.concepts.constructors;

//Example for parameterized constructor && Example for constructor overloading.
public class Employee {

	private String name;
	private String CompanyName;
	private int id;

	Employee() {
		System.out.println("Employee Details: ");
	}

	Employee(String name) {
		this.name = name;
	}

	Employee(String CompanyName, int id) {
		this.CompanyName = CompanyName;
		this.id = id;
	}

	void display() {
		System.out.println(name + " " + CompanyName + " " + id);
	}

	public static void main(String[] args) {

		Employee emp = new Employee();
		Employee emp1 = new Employee("Chandan");
		Employee emp2 = new Employee("HCL", 9);

		emp.display();
		emp1.display();
		emp2.display();
	}

}
