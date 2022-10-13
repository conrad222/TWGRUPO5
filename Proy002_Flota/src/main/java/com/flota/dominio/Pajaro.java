package com.flota.dominio;

public class Pajaro implements Volable{

	@Override
	public void despegar() {
		System.out.println("despego por la pista como un pajaro");
	
	}
	@Override
	public void aterrizar() {
		System.out.println("aterrizo por la pista como un pajaro");
	}
	
	@Override
	public void volar() {
		System.out.println("vuelo por la pista como un pajar");

	}
}
