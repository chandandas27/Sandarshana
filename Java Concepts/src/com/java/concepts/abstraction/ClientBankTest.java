package com.java.concepts.abstraction;

public class ClientBankTest {

	public static void main(String[] args) {
		
		RBI bank;

		 bank = new SBI();
		 System.out.println(bank.getRateOfInterest());
		
		 bank = new HDFC();
		 System.out.println(bank.getRateOfInterest());
	}

}
