package com.flota.pruebas;

import javax.management.RuntimeErrorException;

public class Caja {
	
	private double peso;
	
	//Constructor
	//crear el objeto reservando la memoria
	//necesaria para uardar todos sus atributos
	//Asegura de inicializar los atributos
	//para que el objeto sea consistente (preparado)
	public  Caja() {
		peso = 100.0;
		
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double nuevoPeso) {
		//TODO LO QUE SEA
		//validar peso > 0
		if(peso <= 0) {
			throw new RuntimeException("La caja debe pesar algo");
		}
		peso = nuevoPeso;
	}
	
		

}
