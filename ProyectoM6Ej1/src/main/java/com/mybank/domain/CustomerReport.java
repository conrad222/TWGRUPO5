package com.mybank.domain;

public class CustomerReport {

	public static void main(String[] args) {
		
//		Account[] ac= new Account(3);
		Customer cus1= new Customer("Jane", "Sims");
		Customer cus2= new Customer("Bryant", "Owen");
		Customer cus3= new Customer("Tim", "Soley");
		Customer cus4= new Customer("Maria", "Soley");
		
		System.out.println("CUSTOMERS REPORT");
		System.out.println("================\n");
		
		System.out.println("Customer: " +cus1.getLastName()+", "+ cus1.getFirstName() );
		
		System.out.println("Customer: " +cus2.getLastName()+", "+ cus2.getFirstName() );
		
		System.out.println("Customer: " +cus3.getLastName()+", "+ cus3.getFirstName() );
		
		System.out.println("Customer: " +cus4.getLastName()+", "+ cus4.getFirstName() );
		
	}
	
}
