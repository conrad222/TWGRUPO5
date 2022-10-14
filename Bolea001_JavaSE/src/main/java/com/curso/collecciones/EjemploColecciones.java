package com.curso.collecciones;

import java.util.*;

public class EjemploColecciones {
	
	
	public static void main(String[] args) {
		
		// Clase de permiten
		// tener una colleccion de Objetos
		// 		.tamaño ilimitado
		// 		.solo admiten objetos
		//		.muchos tipos de colecciones
		
		// Collection <<I>> (un objeto)
		//		Set <<I>>
		//		List <<I>>
		
		// Map <<I>> ( key - value)
		
		// Clase utilidad Collections y Arrays
		
		// Collecciones Genericas
		
		// Comparable y Comparator
		
		//_________________________
		
		//Collection
		//	Set							NO DUPLICADOS
		//		HashSet					NO ORDENADOS
		//		LinkedHashSet			ORDENADOS POR ORDEN DE INSERCION
		//		TreeSet					ORDEN NATURAL(COMPARABLE/COMPARATOR)
		//	List						PERMITEN DUPLICADOS //INDEXADO
		//		ArrayList		.add(obj)	.add(indi,obj)	.get(ind)
		//		LinkedList
		//		Queu
		
		
		Collection c; // Interfaz
		//Set<String> s; // interfaz	Colecciones NO DUPLICADOS
		Set s= new HashSet();
		s.add("Zapato");
		s.add("Avión");
		s.add(new Integer(2));
		
		s.remove("Avión");
		
		for(Object o : s) {
			System.out.println(o);
		}
//		Set<String> nombres = new TreeSet();//collection de tipo set, orden alfabetico
//		Set<String> nombres = new HashSet();
		Set<String> nombres = new LinkedHashSet(); //orden inserccion
		
		nombres.add("Begoña");
		nombres.add("Luis");
		nombres.add("Fer");
		nombres.add("Paco");
		boolean añadido= nombres.add("Begoña");
		
		if(!añadido) System.out.println("No pudo añadir a Begoña");
		
		for(String n : nombres) {
			System.out.println(n.toUpperCase());
		}
		
		System.out.println(".............");

		Punto p1 =new Punto(0,2);
		Punto p2 =new Punto(1,1);
		Punto p3 =new Punto(1,1);
		Punto p4 =new Punto(1,5);//repite
		
		// NO PERMITE DUPLICADO - NO HAY ORDEN
//		Set<Punto> figura = new HashSet();
		Set<Punto> figura = new TreeSet();
		
		figura.add(p1);
		figura.add(p2);
		figura.add(p3);
		figura.add(p4);
		
		for(Punto p : figura) {
			System.out.println(p);
		}
		
		//Comparator
		
		Set<String> apellidos = new TreeSet(new ComparadorStringOrdenInverso());//collection de tipo set, orden alfabetico

		
		apellidos.add("Alas");
		apellidos.add("Dodos");
		apellidos.add("Etxea");
		apellidos.add("Polo");
		
		for(String n : apellidos) {
			System.out.println(n.toUpperCase());
		}
		
		// COLECCIONS DE TIPO LIST
		
		List<String> paises = new ArrayList<String>();
		paises.add("China");
		paises.add("Egipto");
		paises.add("Italia");
		paises.add("Perú");
		paises.add("Perú");
		paises.add(0,"España");
//		paises.add(30,"otro");
		
		System.out.println("pais en 0 "+ paises.get(0));
		
		System.out.println("..... lista paises: ");
		for(String p : paises) {
			System.out.println(p);
		}
		
//		Collections.sort(paises);//sort solo admite coleccionar arraylists
//		//es una collection String, ordena tomando el comparable 
//		
//		System.out.println("pais en 0 "+ paises.get(0));
//		
//		System.out.println("..... lista paises ordenado: ");
//	
//		for(String p : paises) {
//			System.out.println(p);
//		}
		
		Collections.sort(paises, new ComparadorStringOrdenInverso());
	
		System.out.println("pais en 0 "+ paises.get(0));
		
		System.out.println("..... lista paises orden inverso: ");
		for(String p : paises) {
			System.out.println(p);
		}
		
		LinkedList<String> lista = new LinkedList<String>();
		
		lista.addFirst("Hola");
		lista.add("hola2");
		lista.addLast("asds");
		lista.getFirst();
	
		//COLAS
		
		PriorityQueue<Integer> cola = new PriorityQueue<Integer>();
	
		cola.add(39);
		cola.add(1);
		cola.add(10);
		cola.add(59);
		cola.add(30);
		
		for (Integer i :cola)  System.out.println(i);
		
//		Integer trato =cola.peek();
//		System.out.println("me entrega "+ trato);
//		System.out.println(cola.peek());
//		System.out.println(cola.peek());
		System.out.println("............");

		
		System.out.println(cola.poll());
		System.out.println(cola.poll());
		System.out.println(cola.poll());
		
		System.out.println("........... ");

		for(Integer i : cola) System.out.println(i);
	}
}
