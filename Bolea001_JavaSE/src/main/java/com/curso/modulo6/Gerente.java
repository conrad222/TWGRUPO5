package com.curso.modulo6;


public class Gerente extends Empleado {// extends herencia entre gerente y empleado

	//atributos = todos los del padre + suyos
	private String departamento;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	

	
}
