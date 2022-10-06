package com.mybank.domain;

public class TestBanking {

	public static void main(String[] args) {
		//matriz objeto
		Customer custom[] = new Customer[2];
		custom[0] = new Customer("Laura","Garcia");
		custom[1] = new Customer("Laura","Garcia");
		for (int i=0;i<custom.length;i++) {      
		      System.out.println(i);
		}
		
		for(Customer cliente: custom)
			cliente.printDetails();
		
		
	}

}
