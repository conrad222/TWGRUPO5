package com.curso.modulo5;

public class EjemploArrayEnteros {
	
	public static void main(String[] args) {
		//Array es un objeto, que me atributos primitivos
		int[] numeros; //declaro un array de tipos int
		
		numeros = new int[4]; //creo un array de enteros inicializados a 0, tipos primitivos se inicializan a 0
		
		numeros[0] = 7;
//		numeros[4] = 8; //java.lang.ArrayIndex....
		
		for(int n : numeros) {
			System.out.println(n);
		}
		
		
		//declarar e inicializar
		
		int[] cantidades = {1, 34, 56, 0, 23}; // crea una array de 5 enteros
		
		int[] c ;
		c = new int[] {2,3,0};
		
		
		
	}

}
