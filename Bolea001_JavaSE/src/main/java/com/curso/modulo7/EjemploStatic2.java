package com.curso.modulo7;

import java.sql.Connection;

// ConexionesBDUtil
public class EjemploStatic2 { //si pones que es final la clase, no puede heredar

	public static final String USER_DB="alfresco";
	public static final String URL_DB="alfresco";
	
	// No que se instancien objetos de la EjemploStatic2
	//se declara el constructor private
	EjemploStatic2() {
		
	}
	
	public static Connection getConnection() {
		return null;
		
	}
	

}
