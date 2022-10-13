package com.flota.dominio;

/**
 * Clase que representa un vehiculo de un flota
 * Puede transportar caja
 * Pero tiene carga máxima permitida
 * @author Bolea
 * @version 1.0
 * 
 * 
 */
import java.security.PublicKey;

import com.flota.pruebas.Caja;

public abstract class Vehiculo {
	
	//atributos
	private double cargaMaxima;
	
	public final double CARGA_MAXIMA_POR_DEFECTO = 5222.78;
	
	private double cargaActual = 2000;
	
	private String matricula = "";
	
	private int numCajas = 0;
	
	
	//constructores
	public Vehiculo(String matricula, double cargaMaxima) {
		//validar matricula no null
		//validar carga maxima > 0
		this.matricula =matricula;
		this.cargaMaxima= cargaMaxima;
	}
	
	//métodos
	
	public double getCargaMaxima() {
		return cargaMaxima;
		
		
	}
	
	public void setCargaMaxima(double cargaMaxima) {
		if(cargaMaxima < 0) {
			throw new RuntimeException("No puede pasar la carga");
		}
		this.cargaMaxima = cargaMaxima;
		
		
	}
	
	/**
	 * Método que recibe el peso de la caja a cargar
	 * y incrementa el peso actual del camión y
	 * el número de cajas cargadas
	 * Si el peso no es válida (<0) lanza una exception
	 * 
	 * Si el peso a carar supera el max pemitido exce...
	 * @param peso peso de la caja a cargar en kg
	 * @throws RuntimeException el peso de la caja no es válido o supera la carga máxima permitida
	 */
	public void cargarCaja(double peso) {
		//validar que el peso > es mayor que 0
		
		if(peso <= 0) {
			throw new RuntimeException("La caja debe pesar algo");
		}
		//validar que cabe. Que no supera la carga máxima
		if(peso+cargaActual > cargaMaxima) {
			//puedo cargar
			throw new RuntimeException("No puede pasar la carga");
		}
		
		this.cargaActual +=peso;
		this.numCajas ++;
		
	}// cierro caja
	
	public void cargarCaja(Caja c) {
		cargarCaja(c.getPeso());
	}
	public double getCargaActual() {
		return cargaActual;
	}

	public int getNumCajas() {
		return numCajas;
		
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
//	public double consumoFuel() {
//		return this.numCajas * 1.5;
//	}
	
	public abstract double consumoFuel();
		
	
}
