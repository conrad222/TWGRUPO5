package com.mybank.domain;

public class TestBanking {

	public static void main(String[] args) {
		
		Account ac= new Account(500.00);
		
		Customer cu=new Customer("Luis ","Ramos");
		
		System.out.println("Creando el cliente "+ cu.getFirstName()+ cu.getLastName());
		
		System.out.println("Creando su cuenta bancario con saldo "+ ac.getBalance() );
		
		System.out.println("Sacar "+ ac.withdraw(150.00));

		System.out.println("Ingresar "+ ac.deposit(22.50));
		
		System.out.println("Sacar "+ ac.withdraw(47.62) );
		
		System.out.println("Sacar "+ ac.withdraw(400.00) );
		
		System.out.println("Customer ["+ cu.getFirstName()+", "+ cu.getLastName()+"] tiene un saldo de "+ ac.getBalance() );
		

	}

}
