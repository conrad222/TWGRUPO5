package com.curso.pruebas;

public class Refrescos {
	
	private String sabor;
	private String cl;
	private double precio;
	private boolean agotado;
	private int stock;
	
	
	public Refrescos(String sabor, String cl, double precio, boolean agotado, int stock) {
		super();
		this.sabor = sabor;
		this.cl = cl;
		this.precio = precio;
		this.agotado = agotado;
		this.stock = stock;
	}
	
	
	public void reponer(Refrescos refresco) {
		
		
	}
	
	public void vender( ) {
		
		
	}


	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public String getCl() {
		return cl;
	}


	public void setCl(String cl) {
		this.cl = cl;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public boolean getAgotado() {
		return agotado;
	}


	public void setAgotado(boolean agotado) {
		this.agotado = agotado;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	
	
	

}
