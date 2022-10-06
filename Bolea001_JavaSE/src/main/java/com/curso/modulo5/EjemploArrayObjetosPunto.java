package com.curso.modulo5;

public class EjemploArrayObjetosPunto {
	
	public static void main(String[] args) {
		
		Punto[] figura; //figura es array de la clase Punto
		
		figura = new Punto[3];
		
		figura[0]= new Punto(3,4);
//		figura[1]= new String("hola");
		
		for(Punto p: figura) {
			System.out.println(p);
		}
		
		// array de 3 puntos;
		
		Punto[] triangulo = {
			new Punto(2,3),
			new Punto(4,9),
			new Punto(7,11),
			
		};
		
		System.out.println("triangulo...");
		for(Punto p: triangulo) {
			System.out.println(p);
		}
		
	}
}
