package com.curso.modulo4;

import java.util.Date;

public class PruebaPedido {

	public static void main(String[] args) {
		// dos posibles formas de crear obj Producto
		
		Pedido p= new Pedido(1);
		
		p.setCantidad(10);
		p.setIdProducto(45);
		p.setFechaPedido(new Date());
		p.setObservaciones("urge");
		
		System.out.println(p);// muestra el fullqualifiedname de memoria
		
		Pedido p2=p;
		System.out.println(p2);//dirección de memoria que almacena la variable de referencia
		System.out.println(p2.getIdPedido());
		
		p.setCantidad(500);
		
		p.toString();
		
	}

}
