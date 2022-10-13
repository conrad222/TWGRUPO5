package com.curso.animales;

public class Cat extends Animal{
	
	private String name;

	public Cat(String n) {
		super(3);
		this.name = n;
	}
	public Cat() {
		super(0);
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}
	
	public void play() {
		System.out.println("juega a algo");
	}
	
	public void eat() {
		System.out.println("come algo ÑAM ÑAM");
		
	}
	
	
	
	
	

}
