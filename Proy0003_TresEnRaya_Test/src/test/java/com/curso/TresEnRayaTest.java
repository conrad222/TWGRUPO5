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
		
		
		fail("Not yet implemented");// dará fail, si lo quitamos dará bien
	}

}
