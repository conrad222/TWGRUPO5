package com.curso.modulo4;

public class EjemploAmbitos {
	
	//variables por su ámbiot
//		.variable local
//			.declarada como argumento de un metodo o const
//		.variable de instancia
//			.atributos de una clase
//		.variable de clase (static)
//			.atributos de la clase estáticos
	
	double pm = Producto.PRECIO_MINIMO;
	
	Producto p = new Producto("lápiz");
	//ram en la memoria de pila una variable local p
	//ram en la memoria dinámica
	// con 3 atributos (var de instancia) id, descr, precio
	
//	p.PRECIO_MINIMO= 44.9;//mala practica
//	Producto.PRECIO_MINIMO=44.9;
	
	Producto p2 = new Producto("zapato");

}
