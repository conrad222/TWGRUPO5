package com.curso.collecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemplosMap {
	
	public static void main(String[] args) {
		//Todos las aplicaciones hasta ahora eran Java Standar Edition, con la aplicación web sera JAVA Enterprise Edition: para aplicaciones web, componentes, mensajeria
		//Map <<Interface>>
		
		//	. solo trabajan con objetos
		//	. key - único NO DUPLICADOS
		//	. value - si duplicados
		
		Map map;
		// map.put(key, value)
		// map.get(key):value
		
//		Map<Integer, Punto> figura = new HashMap<>();
//		figura.put(1, new Punto(0,0));
//		figura.put(10, new Punto(4,6));
//		figura.put(10, new Punto(8,8));
		
		
		// key no duplicado - value
		map = new HashMap(); // no ordenado
		
		Map<Integer, Punto> figura = new HashMap();
		figura.put(10, new Punto(4,6));
		figura.put(2, new Punto(6,6));
		figura.put(7, new Punto(6,6));// ahora 10 apunta a (8,8)
		
		System.out.println(10);
		
		figura.remove(1);
		System.out.println(figura.get(1));
		
		
		Collection<Punto> valores = figura.values();
		Set<Integer> claves = figura.keySet();
		
		System.out.println("............... recorre los valores");
		
		for(Punto p : valores) System.out.println(p);
		
		
		System.out.println("............... recorre los valores y las claves");
		
		for(Integer clave : claves) {
			System.out.println(clave +" "+ figura.get(clave));
		}
		
		//--------------------
		
		
		//HashMap - recorro la coleccion a través de key no hay orden
		//LinkedHashMap - recorro la colecion a través key por orden de insercion
		//TreeMap - recorro la coleccion a través key por orden de Comparable/
		
		
		
		
		
		
		
	}
	
}
