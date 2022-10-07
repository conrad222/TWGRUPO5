package com.curso;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author Alumno
 * 
 * Click derecho, new, junit case
 *
 *para probarlo: run as JUnit Test
 */
public class TresEnRayaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void sumarDosMasDosDara4() {
		//datos entrada
		TresEnRaya juego = new TresEnRaya();
		int n=2;
		int n2=2;
		
		//resultado esperado
		
		int espero = 4;
		
		//resultado real obtenido
		
		int r = juego.suma(n,n2);
		
		//si no coinciden fallos
		if(espero != r) fail("No sumado 2 + 2 = 4 sino que el r " +r);
		
		
//		fail("Not yet implemented");// dará fail, si lo quitamos dará bien
	}
	@Test(expected = RuntimeException.class)
	public void PonerFichaEnCoordenadaXMalLanzaUnaExcepcion() {
		
		TresEnRaya juego = new TresEnRaya();
		// 3 filas y 3 columnas ( 0 a 2)
		//juego.ponerFicha(2,4); //falla si no lanza un RuntimeException, pero la suma está bien
		juego.ponerFicha(4,2);
		
		
	}

	@Test(expected = RuntimeException.class)
	public void PonerFichaEnCoordenadaXBienLanzaUnaExcepcion() {
		
		TresEnRaya juego = new TresEnRaya();
		// 3 filas y 3 columnas ( 0 a 2)
		//juego.ponerFicha(2,4); //falla si no lanza un RuntimeException, pero la suma está bien
		juego.ponerFicha(2,4);
		
		
	}
	@Test(expected = RuntimeException.class)
	public void ponerFichaEnposicionQueYahayOtraLanzaUnaExcepcion() {
		
		//Preparar escenario
		TresEnRaya juego = new TresEnRaya();
		juego.ponerFicha(0,0);
		juego.ponerFicha(0,0); //debe lanzar una Excepcion
		
		
		
	}
	
	@Test
	public void ponerFichaXeYBIenEsperaQueEnEstaPosicionYanoseaNull() {
		
		//Preparar escenario
		TresEnRaya juego = new TresEnRaya();
		juego.ponerFicha(0,0);
		
		if(juego.verFicha(0,0) == null ) {
			fail("La ficha debe estar en esta posición y no hay ficha");
		}
		
	}
	
	@Test
	public void primerJugadorEsX() {
		
		TresEnRaya juego = new TresEnRaya();
		
		if(juego.getJugadorActual() !='X') {
			fail("El primer jugador debe ser X");
		}
		
	}
	
	@Test
	public void siAnteriorJugadorEsXAhoraES0() {
		
		TresEnRaya juego = new TresEnRaya();
		juego.ponerFicha(0,0);
		if(juego.getJugadorActual() !='0') {
			fail("El primer jugador debe ser 0");
		}
		
	}
	
	@Test
	public void siAnteriorJugadorEs0AhoraESX() {
		
		TresEnRaya juego = new TresEnRaya();
		juego.ponerFicha(0,0);
		juego.ponerFicha(0,2);// hacemos dos tiradas
		if(juego.getJugadorActual() !='X') {
			fail("El primer jugador debe ser X");
		}
		
	}
	
	@Test
	public void cuandoJugadorHaceLineaHorizontalThenGana() {
//		
//		String ganador =null;
//		ganador = tresEnRaya.jugar(2.1); //X
//		ganador = tresEnRaya.jugar(2.1); //X
//		ganador = tresEnRaya.jugar(2.1); //X
//		ganador = tresEnRaya.jugar(2.1); //X
//		ganador = tresEnRaya.jugar(2.1); //X
//		assertEquals(ganador, "X es el ganador");
		
		
	}
	
	public void cuandoJugadorHaceLineaDiagonalIzqThenGana() {
		
//		String ganador =null;
//		ganador = tresEnRaya.jugar(2.1); //X
//		ganador = tresEnRaya.jugar(2.1); //X
//		ganador = tresEnRaya.jugar(2.1); //X
//		ganador = tresEnRaya.jugar(2.1); //X
//		ganador = tresEnRaya.jugar(2.1); //X
//		assertEquals(ganador, "X es el ganador");
		
		
	}
	
	
	
}
