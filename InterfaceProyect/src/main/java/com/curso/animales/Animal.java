package com.curso.animales;

public abstract class Animal {
	
	protected int legs;

	protected Animal(int legs) {
		this.legs = legs;
	}
	
	public void walk() {
		System.out.println("Camina sobre" +legs+" patas");
	}
	
	public abstract void eat();
	

}
