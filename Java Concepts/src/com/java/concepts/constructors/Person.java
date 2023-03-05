package com.java.concepts.constructors;

//Example for default constructor.
public class Person {

	String name;
	int age;

// Here, we are not creating any constructor.
// So, Java Compiler will automatically insert a default constructor.

	void display() {
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {

		Person p = new Person(); // Calling default constructor.

// Call display() method using object reference variable p.

		p.display();

	}

}
