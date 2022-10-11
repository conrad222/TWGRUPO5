package com.curso.modulo6;

import java.sql.Date;

public class Empleado {
	//constantes
	private static final double SALARIO_BASE = 15000.0;
	//atributos
	public String nombre; 
	public double salario;
	public Date fechaNacimiento;
	
	//constructores
	
	public Empleado(String nombre, double salario, java.util.Date fnac) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.fechaNacimiento = (Date) fnac;
	}

	public Empleado(String nombre, double salario) { //llama a los atributos y la constante
		this(nombre,salario, null);
		
	}
	public Empleado(String nombre, Date fechaNacimiento) {
		this(nombre,SALARIO_BASE, fechaNacimiento);
		
	}
	
	public Empleado(String nombre) {//llama a string nombre, double salario
		this(nombre, SALARIO_BASE);
		
	}
	
	//métodos
	public String getNombre() {
		return nombre;
	}
	
	public String getDetails() {
		return nombre + " tiene salario " +salario;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void hablar() {
		
		System.out.println("estoy hablando");
		
	}

	public static void saluda() {
		
		System.out.println("estoy hablando");
		
	}


	


}
