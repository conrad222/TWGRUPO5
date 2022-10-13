package com.flota.dominio;

public class PruebaCajaMejorada {

	public static void main(String[] args) {
		
		VehiculoMejorado v = new VehiculoMejorado("aa", 300);
		Caja c = new Caja();
		c.setPeso(350);
		
		//añadir la caja al camión
		try {
			v.cargarCaja(c);
		} catch (CargaException e) {
			System.out.println("error "+ e.getMessage());
			System.out.println("exceso de carga es "+ e.getExcesoCarga());
		}
	}
}
