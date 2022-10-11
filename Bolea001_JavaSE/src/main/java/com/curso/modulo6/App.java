package com.curso.modulo6;

import java.sql.Date;

public class App {
	public static void main(String[] args) {
		
		Empleado e = new Empleado("Luis");
		e.setNombre("Luis");
		e.setSalario(2000.0);
		
		Gerente g = new Gerente("Luis","i");
		g.setNombre("Carlos");
		g.setSalario(2345.0);
		g.setDepartamento("INFORMÁTICA");
		
		System.out.println(e.getDetails());
		System.out.println(g.getDetails());
		
		Secretario s= new Secretario("Luis",5000, null);
		s.setNombre("Roberto");
		s.setSalario(2345.0);
		System.out.println(s.getDetails());
		
		Empleado e22 = new Gerente("Luis", "i");
		e22.setNombre("Rosa");
		
		System.out.println(e22.getDetails());
		e22.saluda(); // no estamos sobrecargando. Ejecuta metodo estatico
		// Empleado, es decir, mira el tipo de la var de ref
		
		Empleado.saluda();
		Gerente.saluda();
		
		//Principio Argumentos polimorficos
		Gerente soyGerentes= (Gerente) e22;
		
		if(e22 instanceof Gerente) {
			soyGerentes = (Gerente) e22;
		}//Final Argumentos polimorficos
		
		Empleado mario = new Empleado ("Mario", 34000.0, new Date(0));
		
		Gerente ggg = new Gerente("BEGOÑA", 45000.0, new Date(0),"Desarrollo");
	
		System.out.println(mario.getClass());
		System.out.println(mario.toString()); //mario, devuelve la dirección de memoria del objeto
	}
}
