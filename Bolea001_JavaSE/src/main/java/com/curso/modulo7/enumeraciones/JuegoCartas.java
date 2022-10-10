package com.curso.modulo7.enumeraciones;

import java.util.Iterator;
import static com.curso.modulo7.enumeraciones.Palos.*;
import static java.lang.Math.*;
import static java.sql.Connection.*;

public class JuegoCartas {
	
	public static void main(String[] args) {
		
		Carta c1 = new Carta(Palos.OROS, 2);
		Carta c2 = new Carta(COPAS, 2);
	
		
		System.out.println(Palos.OROS);
		System.out.println(Palos.OROS.ordinal());
		
		Palos[] valores= Palos.values();
		
		System.out.println("...los palos son");
		for (Palos p: valores) {
//			System.out.println(p);
			System.out.printf(" %s ordinal %d" , p, p.ordinal());
		}
		
		if(c1.getPalo() == Palos.OROS) {
			System.out.println("... eres el mejor");
		}
		
		double area = 2 * PI * 323.9;
		double aleatorio =random();
		
	}

}
