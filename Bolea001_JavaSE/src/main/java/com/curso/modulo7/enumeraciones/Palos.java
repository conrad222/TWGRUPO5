package com.curso.modulo7.enumeraciones;

public enum Palos {//DECLARAR ENUMERACION

	OROS, BASTOS, COPAS, ESPADAS
}

enum ModelosCoche{
	//Modeloscoche.BASICO = new ModelosCoche("Solo tiene motor y ruedas")
	BASICO("Solo tiene motor y ruedas"), MEDIO("tiene aireacondicionado"), SUPERIOR("con navegador");
	
	//atributos
	private String descripcion;
	
	//constructores
	private ModelosCoche(String s) {
		this.descripcion=s;
	}
	
	//metodos
	
	public String getDescripcion() {
		return descripcion;
	}
}