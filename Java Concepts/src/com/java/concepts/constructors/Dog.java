package com.java.concepts.constructors;

//Example for non-parameterized constructor.
public class Dog {

	String breed;
	int age;

	// Declare a non-parameterized constructor.

	Dog() {
		breed = "Labrador";
		age = 25;
	}

	public static void main(String[] args) {

		Dog d = new Dog();
		System.out.println("Dog's breed = " + d.breed);
		System.out.println("Dog's age = " + d.age);

	}

}
