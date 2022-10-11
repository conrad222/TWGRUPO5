package com.curso.modulo6;

import java.util.Date;

public class Gerente extends Empleado {// extends herencia entre gerente y empleado
	
	//atributos = todos los del padre + suyos
	public String departamento;
	
	//constructores
	
	public Gerente(String nombre, double salario, Date fnac, String dpto) {
		super(nombre,salario, fnac); // el constructor de la clase Empleado
		this.departamento=dpto;
	}
	
	public Gerente(String nombre, String dpto) {
		super(nombre); // el constructor de la clase Empleado
		this.departamento=dpto;
	}


	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String getDetails() {
		return super.getDetails()+ " Gerente de: " + departamento;
		
	}
	//NO PODEMOS SOBREESCRIBIR UN METODO QUE SEA PRIVADO Y TAMBIÉN ESTÁTICO
	public static void saluda() {
		
		System.out.println("Hola soy un gerente");
		
	}

	
}
