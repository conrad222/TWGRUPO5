package com.curso.varios;

/*
 * JVM cargar la clase com.curso.varios.Saludador (Full QWualified Name)
 */
public class Saludador {
	//atributos: tener sus propios valores
	private String saludo="Hola";
	//constuctores
	public Saludador() { //Constructo
		super();
		this.saludo= "Hola";
	}
	//public  void Saludador() { metodo por el void
		
	//}
	
	public Saludador(String saludo) {
		this.saludo= saludo;// hace referencia this a los atributos de la clase
		
	}
	//métodos
	
	public String saluda(String nombreUsuario) {
		//return "Hola " + nombreUsuario;
		//return null;
		return this.saludo + nombreUsuario;
		
	}
	
	//Sobrecagar el método
	public String saluda() {
		//return "Hola Amigo";
		return this.saludo + " Amigo";
	}
	

}
