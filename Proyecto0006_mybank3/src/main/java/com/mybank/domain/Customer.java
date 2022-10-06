package com.mybank.domain;


public class Customer {
	
	private String nombre;
	private String apellido;
	public Customer(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void printDetails() {
		
		System.out.println("Cliente [" + "] es "+apellido+","+nombre);
		
	}
	
	
	
	
	
	
	

}
