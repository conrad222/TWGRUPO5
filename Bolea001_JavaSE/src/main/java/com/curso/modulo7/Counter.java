package com.curso.modulo7;

public class Counter {

	private int serialNumber;
	private static int counter =0;
	
	public Counter() {
		this.serialNumber= ++counter;//vale 3
	}
	
	//pruebas
	public static void main(String[] args) {
		
//		System.out.println(Counter.counter);
		System.out.printf("counter vale %d %n ",Counter.counter);
		
		//crear 3 objetos Counter
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		//ver sus serial numbers
		
		System.out.printf("c1 %d, c2 %d, c3 %d %n"
				, c1.getSerialNumber()
				,c2.getSerialNumber()
				,c3.getSerialNumber());
		//y ver lo que vale ahora counter
		System.out.printf("counter vale ahora %d %n ",Counter.counter);
		
	}

	private int getSerialNumber() {
//		this.counter++;
		return serialNumber;
	}
}
