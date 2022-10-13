package com.curso.modulo7;

public class EjemploClasesWrapper {

	public static void main(String[] args) {
		//Clases envoltorio
		int numero = 2;
		Integer numero2 = new Integer(2);
		
		Integer numero3 = 2; // internamente new Integer(2)
	
		int a = numero3; // .intValue(); 
		
		int b = numero3 + new Integer(4);
		
		
		//comparación del valor de la var de ref, esto es
		//compara la dirección de memoria ==
		//comparar contenido con el objeto equals
		//comparar objetos si os si con el equals siempre
		Integer n1 = 3;//true
		Integer n2= 3;//true
		Integer n3 = new Integer(12);
//		Integer n1 = 128; //false
//		Integer n2= 128; //false
//		
		System.out.println("n1 == n2 "+ (n1==n2)); //true
		System.out.println("n1 == n3 "+ (n1==n3)); //true
		if(n1.equals(n2)) {
			System.out.println("n 1 y n2 son iguales");
		}
		
		
	}
}
