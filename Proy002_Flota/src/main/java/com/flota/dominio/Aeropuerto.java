package com.flota.dominio;

public class Aeropuerto {

	public void gestionarVuelo(Volable v) {
		
		v.despegar();
		v.volar();
		v.aterrizar();
	}
	
	public static void main(String[] args) {
		//la var de redf v puede apuntar a cualquier objeto
		//de la clase que emplementes el interfaz volable
		Volable v = new Avion("dasad", 4545);
		
		Aeropuerto aeropuerto = new Aeropuerto();
		aeropuerto.gestionarVuelo(v);
	
		
		Pajaro p = new Pajaro();
		aeropuerto.gestionarVuelo(p);
	}
}
