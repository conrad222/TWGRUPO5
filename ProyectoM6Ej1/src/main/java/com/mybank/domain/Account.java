package com.mybank.domain;

public class Account {
	  //ATRIBUTOS
    private double balance;
    
    //CONSTRUCTORES
    public Account(double initBalance){
        if(initBalance > 0){
            this.balance = initBalance;
        }
    }
    
    //MÉTODOS

	public double getBalance() {
        return balance;
    }

    public boolean deposit(double amt){
    	
    	balance = balance + amt;
		return true;
    }
    
    public boolean withdraw(double amt){
    	
    	boolean result = false; // supone fallo de la  operación
    	if ( amt <= balance ) {
    	balance = balance - amt;
    	result = true; // éxito de la operación
    	}
    	return result;
    	
    }//fin withdraw
    
    //sobreescribimos el método toString

    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + '}';
    }
    
        
    private void informa(String msg){
        System.out.println(".....");
        System.out.println(msg);
        System.out.println("....");
    }    
}
