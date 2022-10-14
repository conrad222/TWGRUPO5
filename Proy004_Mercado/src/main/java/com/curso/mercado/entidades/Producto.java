package com.curso.mercado.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Producto implements Serializable{
	
	private Integer idProducto;
	private String deescripcion;
	private double precio;
	
	public Producto() {
		super();
	}
	

	public Producto(Integer idProducto, String deescripcion, double precio) {
		super();
		this.idProducto = idProducto;
		this.deescripcion = deescripcion;
		this.precio = precio;
	}



	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getDeescripcion() {
		return deescripcion;
	}

	public void setDeescripcion(String deescripcion) {
		this.deescripcion = deescripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(deescripcion, idProducto, precio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(deescripcion, other.deescripcion) && Objects.equals(idProducto, other.idProducto)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
	
	

}
