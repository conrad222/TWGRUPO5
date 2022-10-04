package com.flota.pruebas;
import com.flota.dominio.*;

public class PruebaCaja {

	public static void main(String[] args) {
		
		//variable de tio primitivo
		int contador =0;
		int b =3;
	
		//variable de referencia
		Caja c = new Caja();
		c = new Caja();
		Caja c2 = null;
		Caja c3 = new Caja();
		c2= c3;
		
		c= null;// no apunta a nada
		c3=null;
		//Objetos en memoria RAM 2
		
		
		
		
		
		//c= no hay dirección
		//a=9
		//b apunta a un objeto Integer internamente tiene 9
	}// a partir de aquí la memoria de pila o automática se destruye

}
