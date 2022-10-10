package com.curso.modulo6;

import java.sql.Date;

public class Empleado {
	public String nombre; 
	public double salario;
	public Date fechaNacimiento;
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
