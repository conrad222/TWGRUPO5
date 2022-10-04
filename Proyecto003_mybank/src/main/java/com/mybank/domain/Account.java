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
//        if(amt > 0 ){
//            this.balance = this.balance + amt;
//        } else {
//            System.out.println("Atencion! . No ingresó. No puede ingresar "
//                    + "importes negativos");
//        }
//        informa("deposito hecho");
    	
    	balance = balance + amt;
		return true;
    }
    
    public boolean withdraw(double amt){
         //valido amt debe ser positivo
//         if(amt <= 0 ){
//             System.out.println("Atención!! Debe indicar un importe mayor que cero.");
//             return;
//         }
//   
//         if( balance >= amt ){
//             this.balance = this.balance - amt;
//         }else{
//              System.out.println("Atención!! No puede sacar importe "
//                      + "superior al saldo actual.");  
//         }
//         informa("retirada dinero hecho");
    	  //valido amt debe ser positivo
    	
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
            
}//fin clase
