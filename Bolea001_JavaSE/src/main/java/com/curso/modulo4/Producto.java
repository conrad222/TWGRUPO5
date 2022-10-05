package com.curso.modulo4;

public class Producto {

	private int id; //0
	private String descripcion;//=null
	private double precio;// 0.0
	
	//static - variable de clase
	//final - constante
	public static final double PRECIO_MINIMO =1.2;
	
	
	
	//constructor
	public Producto(String s, double precio) {
		if(s !=null) {
			this.descripcion=s;
		}else {
			this.descripcion="";//INDEFINIDO
		}
//		this.precio=PRECIO_MINIMO;
		if(precio >0) {
			this.precio=precio;
		}
	}
	
	public Producto(int id, String descripcion) {
		this(id, descripcion, PRECIO_MINIMO);
	}
	
	public Producto(int id, String descripcion, double precio) {
		// El this y paréntesis siempre van primero
		this(descripcion, precio);// llama al constructor Producto(String s)
		this.id=id;
		this.precio=precio;
	}
	
	
	public void incrementar() {
		int incremento =2;
		this.precio +=incremento/200;
		
	}
	
	public void prueba() {
//		int x = (int)(Math.random() * 100); 
//		int y;
//		int z;
//		if (x > 50) {
//		y = 9;
//		}
//		z = y + x; // Posible uso antes de inicialización
		}
		
	
}
