package com.flota.dominio;

public class Camion extends Vehiculo {
	
	private int ejes;

	public Camion(String matricula, double cargaMaxima, int ejes) {
		super(matricula, cargaMaxima);
		// TODO Auto-generated constructor stub
		this.ejes=ejes;
	}
	
	public Camion(String matricula, double cargaMaxima) {
		
		this(matricula, cargaMaxima, 2);
	}

	@Override
	public double consumoFuel() {
		// TODO Auto-generated method stub
		return this.ejes * 10 + getCargaActual();
	}

}
