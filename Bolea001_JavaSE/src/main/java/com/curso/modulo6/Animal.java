package com.curso.modulo6;

public class Animal {
	private String sonido;

	public void comer() {
		System.out.println("estoy comiendo");
		
	}
	
//	public static void main(String[] args) {
//		 Gato g =new Gato(); //si
//		  //g = new Perro(); //no
//		  //g = new Animal(); //no en este caso no apunta a objetos suyos o hijos,
//		 //Animal a = service.getAnimal(2);
//		 //g = a; //no
//		 Animal a = new Perro();
//		 Perro p = new Perro();
//		 
//		 //POLIMORFISMO
//		 PerroCaza p2 = new PerroCaza(); //PerroCaza
//		 a = p2; //Animal
//		 p = p2; //Perro
//		 
//		 if(p instanceof PerroCaza) { // intanceof apunta a objeto perrocaza o hijo
//			 PerroCaza caza= (PerroCaza)p;
//			 caza.olfatearPresa();
//		 }
//		 
//		
//	}
}
class Perro extends Animal{
	private String raza;
	
	@Override
	public void comer() {
		System.out.println("estoy comiendo huesos o pienso");
		
	}
}


class PerroCaza extends Perro{
	private int altura;

	public void olfatearPresa() {
		System.out.println("oliendo la presa");
		
	}
	
	@Override
	public void comer() {
		System.out.println("estoy comiendo lo que cazo");
		
	}
}

class Gato extends Animal{

	@Override
	public void comer() {
		System.out.println("como ratones");
		
	}
	
	
}

class Vaca extends Animal{

	@Override
	public void comer() {
		System.out.println("como pasto");
		
	}
	
	
}

