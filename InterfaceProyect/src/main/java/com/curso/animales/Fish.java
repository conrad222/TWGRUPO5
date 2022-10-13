package com.curso.animales;

public class Fish extends Animal implements Pet{

	private String name;
	public Fish(int legs) {
		super(0);
		
	}
	
	public void setName(String name) {
		this.name = name;
		}
	public String getName() {
		return name;
	}
	
	public void play() {
	System.out.println("juego juego juego");
		
	}
	
	public void walk() {
	System.out.println("nado nado nado");
		
	}
	
	public void eat() {
	System.out.println("como como como");
		
	}



	

}
