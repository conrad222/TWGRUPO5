package com.curso.spring.configuracion;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Programador implements Recurso {
	
	private String tarea;
	
	public Programador() {
		tarea ="Aplicacion java";

	}

	public String getTarea() {
		return tarea;
	}

	public void setTarea(String tarea) {
		this.tarea = tarea;
	}

	public void trabajar() {
		System.out.println("Hago tarea " + tarea);
		
	}
	

}
