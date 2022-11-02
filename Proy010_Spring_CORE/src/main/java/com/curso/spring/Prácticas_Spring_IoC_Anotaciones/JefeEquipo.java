package com.curso.spring.Prácticas_Spring_IoC_Anotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JefeEquipo implements Gestor {
	private int equipo;
	@Autowired
	private Recurso recurso;
	
	public JefeEquipo() {
		equipo=23;
		
	}

	public JefeEquipo(int equipo, Recurso recurso) {
		
		this.equipo = equipo;
		this.recurso = recurso;
	}
	
	public void gestionar() {
		System.out.println("El equipo "+equipo);
		recurso.trabajar();
	}
	
	

}
