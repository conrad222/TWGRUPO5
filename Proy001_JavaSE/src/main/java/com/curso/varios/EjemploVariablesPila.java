package com.curso.varios;

public class EjemploVariablesPila {

//	private int e=2;
//	private static int b=2;
//	private static int c=2;
//	private static int d=2;
//	private static int total;
	//main - 1er método que será llamado
	public static void main(String[] args) {
		
		int a = 2;
		metodo1(a);
		System.out.println("fin main");
		
//		total = b + c
//				+ d;
//		System.out.println(total);
		
		
		
	}
	
	public static void metodo1(int a) {
		
		int b = a;
		metodo2();
		System.out.println("fin m1");
	}
	
	public static void metodo2() {
		int c = 3;
		//if(c == 3) throw new RuntimeException("la has liado");
//		String s=null;
//		s.toUpperCase();
		System.out.println("fin m2");
	}
}
