package com.mybank.domain;

public class Bank {

	private Customer[] customers;
	private int numberOfCustomers;
	public Bank() {
	customers = new Customer[1];
	numberOfCustomers = 0;
	}
	public void addCustomer(String nombre, String apellido) {
	 int i = numberOfCustomers++;
	customers[i] = new Customer(nombre, apellido);
	}
	public int getNumOfCustomers() {
	return numberOfCustomers;
	}
	 

}
