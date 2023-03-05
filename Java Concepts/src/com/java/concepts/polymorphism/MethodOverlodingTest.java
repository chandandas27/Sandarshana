package com.java.concepts.polymorphism;

public class MethodOverlodingTest {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		
		int prod = obj.multiply(2,4,6);
		System.out.println("Product of 3 Integer value: "+prod);
		
		double prod1 = obj.multiply(2.0, 4.0, 6.0);
		System.out.println("Product of 3 double value: "+prod1);
	}

}
