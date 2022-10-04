package com.curso.pruebas;
import com.curso.varios.Saludador;
import java.util.*;
import java.util.Date;
public class PruebasSaludador {

	public static void main(String[] args) {
		// Uso de la clase Saludado
		
		//int numeroCamiones= 2 * (int)Math.PI;
		int numeroCamiones= 2;
		Date fecha = new Date();
		
		//1. Se puede crear un objeto Saludador
		// crear un objeo de la clase, instanciar un objeto de la clase
		// s1 variable de referencia que apunta a objetos de tipo saludador
		//Saludador 
		//com.curso.varios.Saludador s1;
		Saludador s1=new Saludador(); //instancia de la clase saludador
		
		//2. Pedir saludar pasando nombre -> muesra "Hola + nombre
		
		// escribo syso  control + espacio
		System.out.println("Hola Amigo"); //imprime en cosola
		
		//3. Pedir saluda sin nombre -> muestra "Hola Amigo"
		System.out.println(s1.saluda());
		
		//4. Crear un saludador en el que  indique el saludo
		Saludador s2 = new Saludador("Buenos días");
		
		//5. Pedir saludo sin nombre "Buenos días Amigo";
		System.out.println(s2.saluda());

	}

}
