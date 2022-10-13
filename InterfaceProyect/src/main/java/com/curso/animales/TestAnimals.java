package com.curso.animales;

public class TestAnimals {
	
	public static void main(String[] args) {
		Fish f = new Fish(0);
		Cat c = new Cat("Fluffy");
		Animal a = new Fish(0);
		Animal e = new Spider();
		Pet p = (Pet) new Cat();
		f.play();
		c.play();
		e.eat();
		e.walk();
		a.walk();
	}

}
