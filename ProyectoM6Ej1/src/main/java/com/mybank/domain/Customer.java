package com.mybank.domain;

public class Customer {

	private Account[] accounts;
	private int numberOfAccounts;
	  //ATRIBUTOS
    private String firstName ;
    private String lastName;
    private Account account;  
    
    //CONSTRUCTORES
   
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = new Account(0);
    }
    
    //MÉTODO

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public Account getAccount(int index) {
        return account;
    }
    
    public void addAccount(Account cuenta) {
   	 int i = numberOfAccounts++;
   	accounts[i] = cuenta;
   	}
    
   	public int getNumOfAccount() {
   	return numberOfAccounts;
   	}
    
}
