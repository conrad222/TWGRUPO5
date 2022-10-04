package com.flota.pruebas;

import com.flota.dominio.Vehiculo;

public class Pruebas {

	public static void main(String[] args) {
		
		Vehiculo camion = new Vehiculo("2345JJ", 500.10); //falla porque la clase vehículo
		//camion.cargaMaxima = 555.25; //atributo cargaMaxima es public
		
		try {
			
			camion.setCargaMaxima(560);
			
			System.out.printf("El camion con matricula %s" + " tiene una carga acutal de %f kg %n", camion.getMatricula(), camion.getCargaActual());//salida de forma formateada, concatenar %
			// %s hace referencia a getMatricula y %f hace referencia a getCargaActual
			System.out.println(" Cargo una caja de 560 kg ");
			camion.cargarCaja(560);
			
			System.out.printf("El camion con matricula %s" + " tiene una carga acutal de %f kg %n", camion.getMatricula(), camion.getCargaActual());
			System.out.println(" Cargo una caja de 100kg ");
			camion.cargarCaja(100);
			
			
		} catch (Exception e) {
			System.out.println("No pudo cargar " + e.getMessage());
		}
	
		
		
	}// fin main

}
