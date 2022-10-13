package com.flota.pruebas;

import com.flota.dominio.Barcaza;
import com.flota.dominio.Camion;
import com.flota.dominio.Vehiculo;
import com.flota.informes.InformeCombustibleNecesario;

public class PruebaAbstraccion {

	public static void main(String[] args) {
		
		Vehiculo[] flota = new Vehiculo[4];
		flota[0]= new Vehiculo("A111", 1000);
		flota[1]= new Camion("A222", 1000);
		flota[2]= new Barcaza("A333", 1000);
		flota[3]= new Barcaza("A444", 1000);
		
		for(Vehiculo v: flota) {
			System.out.println(v.getMatricula()+ " le cargo una caja");
			v.cargarCaja(new Caja());
		}
		InformeCombustibleNecesario inf = new InformeCombustibleNecesario(flota);
		
		inf.generateText(System.out);
	}
}
