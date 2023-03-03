package com.java.concepts.encapsulation;

public class StudentTest {

	public static void main(String[] args) {

// Create the object of class Student by using the new keyword. 
// obj is the reference variable of class student and pointing to the object of the student class. 
		
		Student obj = new Student();
		
// Call setter methods and set the values of variables. 
		
		obj.setStudentName("Chandan Das");
		obj.setStudentID(27);
		
// Call the getter method to Read the value of variables and print it.  		
		
		System.out.println("Student Name is: "+obj.getStudentName());
		System.out.println("Student ID is: "+obj.getStudentID());
		
	}

}
