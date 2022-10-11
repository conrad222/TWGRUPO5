package com.curso.modulo6.equals;

public class PruebasEquals {

	public static void main(String[] args) {
		
		//comparacion entre tipos primitivos
		
		int a = 500;
		int b = 500;
			System.out.println("a == b" + (a==b));
		//comparación entre objetos
			
			Cliente c1 = new Cliente (1,"Laura");//dos clientes iguales tienen el mismo id
			Cliente c2 = new Cliente (1,"Laura");

			System.out.println("c1 == c2 "+ (c1==c2)); //dará false porque apunta a objetos de memoria
			/**
			 * Cliente extiende de Object
			 * y como no sobreescribe equals()
			 * usa == 
			 * 
			 */
			System.out.println("c1 equals c2 " + (c1.equals(c2)));//dará false
	
	
	}

}
