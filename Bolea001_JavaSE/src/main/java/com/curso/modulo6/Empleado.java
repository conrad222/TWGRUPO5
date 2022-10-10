package com.curso.modulo6;

import java.sql.Date;

public class Empleado {
	private String nombre; 
	private double salario;
	private Date fechaNacimiento;
	public String getNombre() {
		return nombre;
	}
	
	public String getDetails() {
		return nombre;
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

	

	


}
